package io.sweat.repository.media

import io.sweat.models.exercise.Exercise
import io.sweat.models.media.Image
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ImageRepository: JpaRepository<Image, Int>