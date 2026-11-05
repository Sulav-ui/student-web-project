import TaskCard from "../Task Card/TaskCard";
import type { Task } from "../Task Card/types/tasks";

interface TaskListProps {
  tasks: Task[];
  onToggle: (id: string) => void;
  onDelete: (id: string) => void;
}

const taskList = ({ tasks, onToggle, onDelete }: TaskListProps) => {
  return (
    <>
      <div>
        {tasks.map((task) => (
          <TaskCard
            key={task.id}
            task={task}
            onToggle={onToggle}
            onDelete={onDelete}
          />
        ))}
      </div>
    </>
  );
};

export default taskList;
