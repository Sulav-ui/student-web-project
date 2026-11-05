import type { Task } from "../Task Card/types/tasks";
interface TaskStatusProps {
  task: Task[];
}
const taskStatus = ({ task }: TaskStatusProps) => {
  const totalTasks = task.length;
  const completedTasks = task.filter((t) => t.completed).length;
  const pendingTasks = totalTasks - completedTasks;
  return (
    <>
      <div>
        <div>
          <h2>Total Tasks</h2>
          <p>{totalTasks}</p>
        </div>
        <div>
          <h2>Completed Tasks</h2>
          <p>{completedTasks}</p>
        </div>
        <div>
          <h2>Pending Tasks</h2>
          <p>{pendingTasks}</p>
        </div>
      </div>
    </>
  );
};

export default taskStatus;
