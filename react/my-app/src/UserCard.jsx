import React from "react";

const UserCard = ({ user }) => {
  return (
    <div className="user-card">
      <h2>Name: {user.Name}</h2>
      <p>Email: {user.Email}</p>
      <p>Username: {user.Username}</p>
    </div>
  );
};

export default UserCard;
