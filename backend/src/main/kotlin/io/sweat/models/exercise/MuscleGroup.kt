package io.sweat.models.exercise

import io.sweat.models.common.Item
import javax.persistence.Entity
import javax.persistence.ManyToMany
import javax.persistence.Table

@Entity
@Table(name = "muscle_group")
class MuscleGroup(name: String, description: String) : Item(name, description) {
    @ManyToMany(mappedBy = "muscleGroup")
    var exercise: Set<Exercise> = setOf()
}
