const express = require("express");
const { createTask, searchTasks } = require("../controller/taskController");

const router = express.Router();

router.get("/", searchTasks);
router.post("/", createTask);

module.exports = router;
