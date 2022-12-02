package ru.seminar.hw.oop4.controllers;

import ru.seminar.hw.oop4.model.Repository;
import ru.seminar.hw.oop4.model.Task;

import java.util.List;

public class TaskController {
    private final Repository repository;

    public TaskController(Repository repository) {
        this.repository = repository;
    }

    public void saveTask(Task task) {
        repository.CreateTask(task);
    }

    public Task readTask(String userId) throws Exception {
        List<Task> tasks = repository.getAllTasks();
        for (Task task : tasks) {
            if (task.getId().equals(userId)) {
                return task;
            }
        }

        throw new Exception("Task not found");
    }
}
