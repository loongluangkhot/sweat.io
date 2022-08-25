package io.sweat.services

import io.sweat.models.exercise.Equipment
import io.sweat.models.exercise.Exercise
import io.sweat.models.exercise.MuscleGroup
import io.sweat.models.media.Image
import io.sweat.models.media.Video
import io.sweat.repository.exercise.ExerciseRepository
import io.sweat.utils.SweatConstants
import io.sweat.utils.SweatException
import org.slf4j.Logger
import org.springframework.stereotype.Service
import javax.persistence.EntityGraph
import javax.persistence.EntityManager
import javax.persistence.TypedQuery
import javax.transaction.Transactional

@Service
class ExerciseService(
    private val entityManager: EntityManager,
    private val exerciseRepository: ExerciseRepository,
    private val logger: Logger
) {
    @Transactional
    fun createExercise(exercise: Exercise): Exercise {
        return exerciseRepository.save(exercise)
    }

    fun createExerciseEntityGraph(): EntityGraph<Exercise> {
        val entityGraphName = Exercise::class.java
        val entityGraph = entityManager.createEntityGraph(entityGraphName)
        entityGraph.addSubgraph<Equipment>("equipment")
        entityGraph.addSubgraph<MuscleGroup>("muscleGroup")
        entityGraph.addSubgraph<Image>("image")
        entityGraph.addSubgraph<Video>("video")
        return entityGraph
    }

    fun createQuery(qlString: String): TypedQuery<Exercise> {
        val entityGraph = createExerciseEntityGraph()
        return entityManager.createQuery(qlString, Exercise::class.java)
            .setHint(SweatConstants.JAVAX_PERSISTENCE_FETCHGRAPH_NAMESPACE, entityGraph)
    }

    @Transactional
    fun getExercise(id: Int, eager: Boolean = false): Exercise {
        if (eager) {
            return createQuery("SELECT e FROM Exercise e WHERE e.id = :id")
                .setParameter("id", id)
                .resultList[0] ?: throw SweatException("Exercise of id $id is not found")
        }
        val maybeExercise = exerciseRepository.findById(id)
        return if (maybeExercise.isEmpty) throw SweatException("Exercise of id $id is not found") else maybeExercise.get()
    }

    @Transactional
    fun getAllExercises(eager: Boolean = false): List<Exercise> {
        if(eager) {
            return createQuery("SELECT * FROM Exercise").resultList
        }
        return exerciseRepository.findAll()
    }
}