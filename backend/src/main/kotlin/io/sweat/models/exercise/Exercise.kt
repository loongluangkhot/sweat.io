package io.sweat.models.exercise

import io.sweat.models.common.Item
import io.sweat.models.media.Image
import io.sweat.models.media.Video
import javax.persistence.*

@Entity
@Table(name = "exercise")
class Exercise(name: String, description: String) : Item(name, description) {
    @ManyToMany(cascade = [CascadeType.PERSIST, CascadeType.MERGE], fetch = FetchType.EAGER)
    @JoinTable(name = "exercise_muscle_group")
    var muscleGroup: MutableSet<MuscleGroup> = mutableSetOf()

    @ManyToMany(cascade = [CascadeType.PERSIST, CascadeType.MERGE], fetch = FetchType.EAGER)
    @JoinTable(name = "exercise_equipment")
    var equipment: MutableSet<Equipment> = mutableSetOf()

    @OneToMany(orphanRemoval = true, cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    @JoinTable(name = "exercise_video")
    var video: MutableSet<Video> = mutableSetOf()

    @OneToMany(orphanRemoval = true, cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    @JoinTable(name = "exercise_image")
    var image: MutableSet<Image> = mutableSetOf()
}
