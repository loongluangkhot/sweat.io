package io.sweat.models.exercise

import com.fasterxml.jackson.annotation.JsonIgnore
import io.sweat.models.common.Item
import javax.persistence.Entity
import javax.persistence.ManyToMany
import javax.persistence.Table

@Entity
@Table(name = "equipment")
class Equipment(name: String, description: String) : Item(name, description) {
    @ManyToMany(mappedBy = "equipment")
    @JsonIgnore
    var exercise: MutableSet<Exercise> = mutableSetOf()
}
