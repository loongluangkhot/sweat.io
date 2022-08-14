package io.sweat.models.common

import org.apache.commons.lang3.builder.ToStringBuilder

interface ILoggable {
    fun toStringEx(): String {
        return ToStringBuilder.reflectionToString(this)
    }
}