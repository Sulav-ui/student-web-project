import { createSlice } from "@reduxjs/toolkit";

const countslice = createSlice({
  name: "counter",

  initialState: {
    value: 0,
    loading: false,
  },

  reducers: {
    increment: (state) => {
      state.value += 1;
    },
    decrement: (state) => {
      state.value -= 1;
    },
    incrementByAmount: (state, action) => {
      state.value += action.payload;
    },
    reset: (state) => {
      state.value = 0;
    },
  },
});
export const { increment, decrement, incrementByAmount, reset } =
  countslice.actions;
export default countslice.reducer;
