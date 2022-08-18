package io.sweat.controllers.exercise

import io.sweat.models.exercise.Exercise
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/exercises")
interface IExerciseController {
    @PostMapping
    fun createExercise(@RequestBody exercise: Exercise): Exercise

    @GetMapping("/{id}")
    fun getExercise(@PathVariable("id") id:Int): Exercise
}