import { useState } from "react";
import TaskForm from "./components/Task Form/taskForm";
import TaskList from "./components/Task List/taskList";
import TaskStatus from "./components/Task Stats/taskStatus";
import type { Task } from "./components/Task Card/types/tasks";
import "./App.css";

function App() {
  const [tasks, setTasks] = useState<Task[]>([]);

  function addTask(title: string, description: string) {
    const newTask: Task = {
      id: crypto.randomUUID(),
      title,
      description,
      completed: false,
    };
    setTasks((prevTasks) => [...prevTasks, newTask]);
  }

  function onDelete(taskId: string) {
    setTasks((prevTasks) => prevTasks.filter((task) => task.id !== taskId));
  }

  function onToggle(taskId: string) {
    setTasks((prevTasks) =>
      prevTasks.map((task) =>
        task.id === taskId ? { ...task, completed: !task.completed } : task,
      ),
    );
  }

  return (
    <>
      <TaskStatus task={tasks} />
      <TaskList tasks={tasks} onDelete={onDelete} onToggle={onToggle} />
      <TaskForm onAddTask={addTask} />
    </>
  );
}

export default App;
