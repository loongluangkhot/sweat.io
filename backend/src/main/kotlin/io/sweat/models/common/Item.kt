package io.sweat.models.common

import javax.persistence.*

@MappedSuperclass
class Item(name: String = "", description: String = "") : ILoggable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Int? = null

    @Column(nullable = false)
    var name: String = name

    @Column(nullable = false)
    var description: String = description

    override fun toString(): String {
        return this.toStringEx()
    }
}