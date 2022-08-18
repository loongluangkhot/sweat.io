package io.sweat.repository.media

import io.sweat.models.media.Video
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface VideoRepository: JpaRepository<Video, Int>