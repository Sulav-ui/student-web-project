import React from "react";

const JobCard = ({ title, description, location }) => {
  return (
    <div className="job-card">
      <h3 className="job-title">{title}</h3>
      <p className="job-description">{description}</p>
      <p className="job-location">{location}</p>
    </div>
  );
};

export default JobCard;
