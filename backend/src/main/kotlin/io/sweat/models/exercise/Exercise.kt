package io.sweat.models.exercise

import io.sweat.models.common.Item
import io.sweat.models.media.Image
import io.sweat.models.media.Video
import org.apache.commons.lang3.builder.ToStringBuilder
import javax.persistence.*

@Entity
@Table(name = "exercise")
class Exercise(name: String, description: String) : Item(name, description) {
    @ManyToMany(cascade = [CascadeType.PERSIST, CascadeType.MERGE])
    @JoinTable(name = "exercise_muscle_group")
    var muscleGroup: Set<MuscleGroup> = setOf()

    @ManyToMany(cascade = [CascadeType.PERSIST, CascadeType.MERGE])
    @JoinTable(name = "exercise_equipment")
    var equipment: Set<Equipment> = setOf()

    @OneToMany(orphanRemoval = true, cascade = [CascadeType.ALL])
    @JoinTable(name = "exercise_video")
    var video: Set<Video> = setOf()

    @OneToMany(cascade = [CascadeType.PERSIST, CascadeType.MERGE])
    @JoinTable(name = "exercise_image")
    var image: Set<Image> = setOf()
}
