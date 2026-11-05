import type { Task } from "./types/tasks";
interface TaskCardProps {
  task: Task;
  onToggle: (id: string) => void;
  onDelete: (id: string) => void;
}
const TaskCard = ({ task, onToggle, onDelete }: TaskCardProps) => {
  return (
    <>
      <h1>Task Card</h1>
      <div>
        <h3>{task.title}</h3>
        <p>{task.description}</p>
        <p>{task.completed ? "Completed" : "Pending"}</p>

        <button onClick={() => onToggle(task.id)}>Status Change</button>
        <button onClick={() => onDelete(task.id)}>Delete</button>
      </div>
    </>
  );
};

export default TaskCard;
