package io.sweat.services

import io.sweat.models.exercise.Exercise
import io.sweat.repository.exercise.EquipmentRepository
import io.sweat.repository.exercise.ExerciseRepository
import io.sweat.repository.exercise.MuscleGroupRepository
import io.sweat.repository.media.ImageRepository
import io.sweat.repository.media.VideoRepository
import org.slf4j.Logger
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class ExerciseService(
    private val exerciseRepository: ExerciseRepository,
    private val equipmentRepository: EquipmentRepository,
    private val muscleGroupRepository: MuscleGroupRepository,
    private val imageRepository: ImageRepository,
    private val videoRepository: VideoRepository,
    private val logger: Logger
    ) {

    @Transactional
    fun createExercise(exercise: Exercise): Exercise {
        return exerciseRepository.save(exercise);
    }

    @Transactional
    fun getExercise(id: Int): Exercise {
        return exerciseRepository.getReferenceById(id);
    }
}