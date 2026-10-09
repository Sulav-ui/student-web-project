const Task = require("../models/Task");

const validStatuses = ["pending", "in-progress", "completed"];

const searchTasks = async (req, res) => {
  try {
    const { search, status } = req.query;

    if (
      status !== undefined &&
      (typeof status !== "string" || !validStatuses.includes(status))
    ) {
      return res.status(400).json({
        message: "Invalid status",
      });
    }

    const filter = {};

    if (typeof search === "string" && search.trim().length > 0) {
      const escapedSearch = search
        .trim()
        .replace(/[.*+?^${}()|[\]\\]/g, "\\$&");

      filter.title = { $regex: escapedSearch, $options: "i" };
    }

    if (status !== undefined) {
      filter.status = status;
    }

    const tasks = await Task.find(filter);

    return res.status(200).json({
      data: tasks,
    });
  } catch (error) {
    return res.status(500).json({
      message: "Internal server error",
    });
  }
};

const createTask = async (req, res) => {
  try {
    const { title, description, status, dueDate } = req.body;

    if (!title || !title.trim()) {
      return res.status(400).json({
        message: "Title is required",
      });
    }

    if (!dueDate) {
      return res.status(400).json({
        message: "Due date is required",
      });
    }

    const task = await Task.create({
      title,
      description,
      status,
      dueDate,
    });

    return res.status(201).json({
      message: "Task created successfully",
      data: task,
    });
  } catch (error) {
    if (error.name === "ValidationError" || error.name === "CastError") {
      return res.status(400).json({
        message: "Invalid task data",
      });
    }

    return res.status(500).json({
      message: "Internal server error",
    });
  }
};

module.exports = {
  createTask,
  searchTasks,
};
