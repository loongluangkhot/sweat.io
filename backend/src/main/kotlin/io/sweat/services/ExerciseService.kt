package io.sweat.services

import io.sweat.models.exercise.Exercise
import io.sweat.repository.exercise.ExerciseRepository
import io.sweat.utils.SweatException
import org.slf4j.Logger
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class ExerciseService(
    private val exerciseRepository: ExerciseRepository, private val logger: Logger
) {

    @Transactional
    fun createExercise(exercise: Exercise): Exercise {
        return exerciseRepository.save(exercise)
    }

    @Transactional
    fun getExercise(id: Int): Exercise {
        val maybeExercise = exerciseRepository.findById(id)
        if (maybeExercise.isEmpty) {
            throw SweatException("Exercise of id $id is not found")
        }
        return maybeExercise.get()
    }
}