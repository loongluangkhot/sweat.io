package io.sweat.controllers.exercise

import io.sweat.models.exercise.Exercise
import io.sweat.services.ExerciseService
import org.springframework.web.bind.annotation.RestController

@RestController
class ExerciseController(private val exerciseService: ExerciseService): IExerciseController {
    override fun createExercise(exercise: Exercise): Exercise {
        return exerciseService.createExercise(exercise)
    }

    override fun getExercise(id:Int): Exercise {
        return exerciseService.getExercise(1)
    }
}