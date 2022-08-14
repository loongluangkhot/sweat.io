package io.sweat.models.media

import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "video")
class Video(name: String, description: String, url: String) : Media(name, description, url)