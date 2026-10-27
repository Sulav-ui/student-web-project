import React from "react";
import { useNavigate } from "react-router-dom";

const contactus = () => {
  const navigate = useNavigate();

  return (
    <div>
      <p>Contact US</p>
      <button onClick={() => navigate("/aboutus")}>Click on Me</button>
    </div>
  );
};

export default contactus;
