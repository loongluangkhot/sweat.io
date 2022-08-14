package io.sweat.repository.exercise

import io.sweat.models.exercise.Exercise
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ExerciseRepository: JpaRepository<Exercise, Int>