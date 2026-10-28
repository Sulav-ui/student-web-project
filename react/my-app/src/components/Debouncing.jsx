import React, { useState, useEffect } from "react";

const Debouncing = () => {
  const [search, setSearch] = useState("");
  const [result, setResult] = useState("");

  useEffect(() => {
    const timer = setTimeout(() => {
      setResult(search);
      console.log("Searching for:....", search);
    }, 1000);
    return () => {
      clearTimeout(timer);
    };
  }, [search]);
  return (
    <div>
      <h2>Search Student</h2>
      <input
        type="text"
        placeholder="Search here..."
        value={search}
        onChange={(e) => setSearch(e.target.value)}
      />
      <p>Search results:{result}</p>
    </div>
  );
};

export default Debouncing;
