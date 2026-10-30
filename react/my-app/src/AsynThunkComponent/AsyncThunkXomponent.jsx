import React from "react";
import { useSelector, useDispatch } from "react-redux";
import { fetchUser } from "../Async Thunk/userSlice";

const AsyncThunkXomponent = () => {
  const dispatch = useDispatch();
  const { dummyUsers, loading, error } = useSelector((state) => state.users);
  return (
    <section>
      <h1>User Data List </h1>
      <button
        onClick={() => {
          dispatch(fetchUser());
        }}
      >
        Fetch User
      </button>

      {loading && <p>Loading the data.....</p>}
      {dummyUsers.map((dummyUser) => {
        return (
          <div key={dummyUser.id}>
            <p>{dummyUser.body}</p>
            <hr />
          </div>
        );
      })}
    </section>
  );
};

export default AsyncThunkXomponent;
