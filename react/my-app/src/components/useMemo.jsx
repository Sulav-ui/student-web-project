import React, { useState, useMemo } from "react";

const UseMemo = () => {
  const [number, setNumber] = useState(0);
  const [count, setCount] = useState(0);

  const square = useMemo(() => {
    console.log("Number is calculating");
    return number * number;
  }, [number]);

  return (
    <div>
      <h1>Number: {number}</h1>
      <h1>Square: {square}</h1>

      <button
        onClick={() => {
          setNumber(number + 1);
        }}
      >
        Change number
      </button>

      <button
        onClick={() => {
          setCount(count + 1);
        }}
      >
        Increase number
      </button>
    </div>
  );
};

export default UseMemo;
