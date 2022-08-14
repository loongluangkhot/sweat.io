package io.sweat.models.exercise

import lombok.Data
import lombok.Generated
import javax.persistence.*

@Data
@Entity
@Table(name = "exercise")
class Exercise(name:String, desc:String) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null

    @Column(nullable = false)
    var name:String = name

    @Column(nullable = false)
    var desc:String = desc

    @ManyToMany
    @JoinTable(name = "exercise_muscle_group")
    var muscleGroups: Set<MuscleGroup>? = null

    @ManyToMany
    @JoinTable(name = "exercise_equipment")
    var equipments: Set<Equipment>? = null
}
