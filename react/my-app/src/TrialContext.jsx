import React, { createContext, useContext, useState } from "react";
import Header from "./Header";

export const UserContext = createContext();

function Profile() {
  const { user } = useContext(UserContext);
  return (
    <>
      <h3>My profile name is: {user}</h3>
    </>
  );
}

const TrialContext = () => {
  const [user, setUser] = useState("Default");
  return (
    <>
      <UserContext.Provider value={{ user, setUser }}>
        <h3>Context Provider</h3>
        <Profile />
        <Header />
        <button
          onClick={() => {
            setUser("Sulav");
          }}
        >
          Change Username
        </button>
      </UserContext.Provider>
    </>
  );
};

export default TrialContext;
