import React, { useEffect } from "react";
import { fetchUser } from "../Async Thunk/userSlice";
import { useDispatch } from "react-redux";

const aboutus = () => {
  const dispatch = useDispatch();
  useEffect(() => {
    dispatch(fetchUser());
  }, []);
  return <div>aboutus</div>;
};

export default aboutus;
