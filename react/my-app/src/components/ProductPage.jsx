import React, { useEffect, useState } from "react";
import Card from "./CardComponent";

const ProductPage = () => {
  const [data, setData] = useState([]);
  useEffect(() => {
    const fetchData = async () => {
      try {
        const data = await fetch("https://jsonplaceholder.typicode.com/posts");
        const getData = await data.json();
        setData(getData);
        console.log(getData);
      } catch (error) {
        console.log(error);
      }
    };
    fetchData();
  }, []);
  return (
    <div
      style={{
        backgroundColor: "#f3f4f6",
        minHeight: "100vh",
        padding: "40px 20px",
        boxSizing: "border-box",
      }}
    >
      <h1
        style={{
          textAlign: "center",
          fontSize: "32px",
          color: "#111827",
          marginBottom: "30px",
        }}
      >
        Product Cards
      </h1>

      <div
        style={{
          display: "grid",
          gridTemplateColumns:
            "repeat(auto-fit, minmax(min(100%, 280px), 1fr))",
          gap: "24px",
          maxWidth: "1200px",
          margin: "0 auto",
        }}
      >
        {data.map((mappedData) => {
          return (
            <div key={mappedData.id}>
              <Card data={mappedData} />
            </div>
          );
        })}
      </div>
    </div>
  );
};

export default ProductPage;
