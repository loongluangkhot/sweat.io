package io.sweat.controllers.exercise

import io.sweat.models.exercise.Exercise
import org.springframework.web.bind.annotation.RestController

@RestController
class ExerciseController: IExerciseController {
    override fun getExercise(id:Int) = Exercise("Bench Press")
}