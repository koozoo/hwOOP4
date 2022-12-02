package ru.seminar.hw.oop4.model;

import java.util.List;

public interface Repository {
    List<Task> getAllTasks();
    String CreateTask(Task task);
}
