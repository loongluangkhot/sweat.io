<script lang="ts">
  import type { IExercise } from "src/lib/models/exercise/exercise";
  export let exercise: IExercise;
</script>

<div>
  <div>{exercise.name}</div>
  <div>{exercise.description}</div>
</div>
