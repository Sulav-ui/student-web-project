import React, { useState } from "react";

interface TaskFormProps {
  onAddTask: (title: string, description: string) => void;
}
const taskForm = ({ onAddTask }: TaskFormProps) => {
  const [formData, setFormData] = useState({
    title: "",
    description: "",
  });
  function handleSubmit(event: React.FormEvent<HTMLFormElement>) {
    event.preventDefault();
    onAddTask(formData.title, formData.description);
    setFormData({
      title: "",
      description: "",
    });
  }
  function handleChange(event: React.ChangeEvent<HTMLInputElement>) {
    setFormData({
      ...formData,
      [event.target.name]: event.target.value,
    });
  }
  return (
    <div>
      <h1>Task Form</h1>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          placeholder="Title"
          name="title"
          value={formData.title}
          onChange={handleChange}
        />
        <input
          type="text"
          name="description"
          placeholder="Description"
          value={formData.description}
          onChange={handleChange}
        />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
};

export default taskForm;
