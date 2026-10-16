import React from "react";
import JobCard from "./JobCard";

const Experience = () => {
  const experienceData = [
    {
      title: "Software Engineer",
      description: "shhdfjh",
      location: "hdjkds",
    },
    { title: "Software Engineer", description: "shhdfjh", location: "hdjkds" },
  ];
  return (
    <section className="experience">
      <div className="container">
        <h2>Experience</h2>
        <p>Here is my work experience</p>
        <div className="job-cards">
          {experienceData.map((eachJob, index) => (
            <JobCard
              key={index}
              title={eachJob.title}
              description={eachJob.description}
              location={eachJob.location}
            />
          ))}
        </div>
      </div>
    </section>
  );
};

export default Experience;
