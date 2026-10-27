import React, { useContext } from "react";
import { UserContext } from "./TrialContext";

const Header = () => {
  const { user } = useContext(UserContext);

  return (
    <header>
      <h1>{user}</h1>
      <p>Software Engineer</p>
    </header>
  );
};

export default Header;
