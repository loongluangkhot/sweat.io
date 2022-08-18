package io.sweat.models.media

import io.sweat.models.common.Item
import javax.persistence.Column
import javax.persistence.MappedSuperclass

@MappedSuperclass
class Media(name: String = "", description: String = "", url: String = "") : Item(name, description) {
    @Column(nullable = false)
    var url: String = url
}