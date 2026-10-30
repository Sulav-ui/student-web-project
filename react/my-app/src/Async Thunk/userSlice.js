import { createSlice, createAsyncThunk } from "@reduxjs/toolkit";

//API Call
export const fetchUser = createAsyncThunk(
  "dummyUsers/fetchedData",
  async () => {
    const response = await fetch("https://jsonplaceholder.typicode.com/posts");
    //console.log(response.json());
    if (!response.ok) {
      throw new Error("Failed to fetch the users");
    }
    return response.json();
  },
);

// Create Silce
export const dummyUserSlice = createSlice({
  name: "dummyUsers",
  initialState: {
    dummyUsers: [],
    loading: false,
  },

  reducers: {},

  extraReducers: (builders) => {
    builders
      .addCase(fetchUser.pending, (state) => {
        state.loading = true;
      })
      .addCase(fetchUser.fulfilled, (state, action) => {
        state.loading = false;
        state.dummyUsers = action.payload;
      })
      .addCase(fetchUser.rejected, (state, action) => {
        state.loading = false;
        state.error = action.error.message;
      });
  },
});

export default dummyUserSlice.reducer;
