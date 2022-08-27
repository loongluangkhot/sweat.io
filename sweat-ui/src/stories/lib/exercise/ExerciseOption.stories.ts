import type { IExercise } from "src/lib/models/exercise/exercise";
import ExerciseOptionSvelte from "../../../lib/components/exercise/ExerciseOption.svelte";

// More on default export: https://storybook.js.org/docs/react/writing-stories/introduction#default-export
// More on argTypes: https://storybook.js.org/docs/svelte/api/argtypes
export default {
  title: "Exercise/ExerciseOption",
  component: ExerciseOptionSvelte,
  // argTypes: {
  //   backgroundColor: { control: 'color' },
  //   label: { control: 'text' },
  //   onClick: { action: 'onClick' },
  //   primary: { control: 'boolean' },
  //   size: {
  //     control: { type: 'select' },
  //     options: ['small', 'medium', 'large'],
  //   },
  // },
};

// More on component templates: https://storybook.js.org/docs/svelte/writing-stories/introduction#using-args
const Template = (args: IExercise) => ({
  Component: ExerciseOptionSvelte,
  props: args,
  // on: {
  //   click: args.onClick,
  // },
});

// More on args: https://storybook.js.org/docs/svelte/writing-stories/args
export const Primary = Template.bind({});
const exercise: IExercise = {
  id: 1,
  name: "Bench Press",
  description: "The best exercise for your chest",
};
Primary.args = {
  exercise
};
