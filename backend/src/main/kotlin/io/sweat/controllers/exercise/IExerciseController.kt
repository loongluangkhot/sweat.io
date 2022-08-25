package io.sweat.controllers.exercise

import io.sweat.models.exercise.Exercise
import org.springframework.web.bind.annotation.*
import javax.annotation.Nullable

@RequestMapping("/exercises")
interface IExerciseController {
    @PostMapping
    fun createExercise(@RequestBody exercise: Exercise): Exercise

    @GetMapping("/{id}")
    fun getExercise(@PathVariable("id") id: Int, @RequestParam("eager") @Nullable eager: Boolean = false): Exercise

    @GetMapping("")
    fun getAllExercises(@RequestParam("eager") @Nullable eager: Boolean = false): List<Exercise>
}