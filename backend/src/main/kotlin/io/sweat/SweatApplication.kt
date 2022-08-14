package io.sweat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SweatApplication

fun main(args: Array<String>) {
	runApplication<SweatApplication>(*args)
}
