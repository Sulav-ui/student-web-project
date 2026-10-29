import React from "react";

const CardComponent = ({ data }) => {
  console.log(data);
  return (
    <div
      className="mainContainer"
      style={{
        backgroundColor: "#ffffff",
        borderRadius: "12px",
        padding: "24px",
        boxShadow: "0 4px 12px rgba(0, 0, 0, 0.08)",
        border: "1px solid #e5e7eb",
        display: "flex",
        flexDirection: "column",
        gap: "12px",
        height: "100%",
        boxSizing: "border-box",
      }}
    >
      <div
        style={{
          display: "flex",
          justifyContent: "space-between",
          alignItems: "center",
        }}
      >
        <span
          style={{
            backgroundColor: "#eff6ff",
            color: "#2563eb",
            padding: "6px 12px",
            borderRadius: "20px",
            fontSize: "13px",
            fontWeight: "600",
          }}
        >
          User ID: {data.userId}
        </span>

        <span
          style={{
            color: "#6b7280",
            fontSize: "13px",
            fontWeight: "500",
          }}
        >
          #{data.id}
        </span>
      </div>

      <h3
        style={{
          fontSize: "20px",
          fontWeight: "600",
          color: "#111827",
          margin: "10px 0 0",
          textTransform: "capitalize",
          lineHeight: "1.4",
        }}
      >
        {data.title}
      </h3>

      <p
        style={{
          fontSize: "15px",
          color: "#6b7280",
          lineHeight: "1.7",
          margin: 0,
          flexGrow: 1,
        }}
      >
        {data.body}
      </p>

      <button
        style={{
          marginTop: "15px",
          padding: "12px",
          backgroundColor: "#2563eb",
          color: "#ffffff",
          border: "none",
          borderRadius: "8px",
          fontSize: "14px",
          fontWeight: "600",
          cursor: "pointer",
        }}
      >
        View Details
      </button>
    </div>
  );
};

export default CardComponent;
