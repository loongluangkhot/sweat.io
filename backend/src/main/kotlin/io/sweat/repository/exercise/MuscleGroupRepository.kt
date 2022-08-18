package io.sweat.repository.exercise

import io.sweat.models.exercise.MuscleGroup
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MuscleGroupRepository: JpaRepository<MuscleGroup, Int>