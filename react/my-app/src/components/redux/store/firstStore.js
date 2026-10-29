import { configureStore } from "@reduxjs/toolkit";
import countslice from "../slice/myFirstSlice";

const store = configureStore({
  reducer: {
    counter: countslice,
  },
});

export default store;
