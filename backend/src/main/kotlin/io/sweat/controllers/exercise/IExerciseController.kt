package io.sweat.controllers.exercise

import io.sweat.models.exercise.Exercise
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/exercise")
interface IExerciseController {
    @GetMapping("/{id}")
    fun getExercise(@PathVariable("id") id:Int): Exercise
}