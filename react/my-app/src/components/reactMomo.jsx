const Student = memo(function Student({ name }) {
  return (
    <>
      <h1>Student Name:{name}</h1>
    </>
  );
});

import React, { useState } from "react";
import { memo } from "react";

const reactMomo = () => {
  const [count, setCount] = useState(0);
  return (
    <div>
      <h1>Count: {count}</h1>
      <button
        onClick={() => {
          setCount(count + 1);
        }}
      >
        Increase
      </button>
      <Student name="Sulav" />
    </div>
  );
};

export default reactMomo;
