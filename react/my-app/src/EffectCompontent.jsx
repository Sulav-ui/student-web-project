import React, { useEffect, useState } from "react";

const EffectCompontent = () => {
  const [count, setCount] = useState(0);
  // No dependency
  //   useEffect(() => {
  //     console.log("Effects run after every render");
  //   });

  //Empty Dependency
  //   useEffect(() => {
  //     console.log("Component mounted");
  //   }, []);

  // With dependency array
  useEffect(() => {
    console.log("Count changed:", count);
  }, [count]);

  return (
    <div>
      <h2>Array</h2>
      <p>Count: {count}</p>
      <button onClick={() => setCount(count + 1)}>Increase</button>
    </div>
  );
};

export default EffectCompontent;
