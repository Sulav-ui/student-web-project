import React, { useEffect } from "react";
import { useState } from "react";
import type { User } from "../types/types";

const useStates = () => {
  const [user, setUser] = useState<User[]>([]);
  const [loading, setLoading] = useState<boolean>(true);

  useEffect(() => {
    const fetchUser = async () => {
      try {
        const response = await fetch(
          "https://jsonplaceholder.typicode.com/users",
        );
        const data: User[] = await response.json();
        setUser(data);
        console.log("Fetched user data:", data);
      } catch (error) {
        console.error("Error fetching user data:", error);
      } finally {
        setLoading(false);
      }
    };
    fetchUser();
  }, []);
  return (
    <div>
      {loading && <p>Loading...</p>}

      {user.slice(0, 3).map((user) => (
        <div key={user.id}>
          <h1>{user.name}</h1>
          <h2>{user.username}</h2>
          <h3>{user.email}</h3>

          <h3>Address Details</h3>
          <p>Street: {user.address.street}</p>
          <p>Suite: {user.address.suite}</p>
          <p>City: {user.address.city}</p>
          <p>Zipcode: {user.address.zipcode}</p>

          <h3>Geo Location</h3>
          <p>Latitude: {user.address.geo.lat}</p>
          <p>Longitude: {user.address.geo.lng}</p>
          <hr />
        </div>
      ))}
    </div>
  );
};

export default useStates;
