package io.sweat.utils

data class SweatException(override val message: String, val errCode: String? = null): Exception(message) {
}