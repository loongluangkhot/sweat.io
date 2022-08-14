package io.sweat.models.exercise

import lombok.Data
import lombok.Generated
import javax.persistence.*

@Data
@Entity
@Table(name = "muscle_group")
class MuscleGroup(name:String, desc:String)  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null

    @Column(nullable = false)
    var name:String = name

    @Column(nullable = false)
    var desc:String = desc

    @ManyToMany(mappedBy = "muscleGroups")
    var exercises: Set<Exercise>? = null
}
