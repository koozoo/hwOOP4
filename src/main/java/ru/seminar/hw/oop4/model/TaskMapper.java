package ru.seminar.hw.oop4.model;

public class TaskMapper {
    public String map(Task task) {
        return String.format("%s;%s;%s;%s;%s;%s;%s;%s", task.getId(), task.getTitle(), task.getDescription() ,task.getFullname(), task.getDate(), task.getTime(), task.getDeadline(), task.getLevel());
    }

    public Task map(String line) {
        String[] lines = line.split(";");
        return new Task(lines[0], lines[1], lines[2], lines[3], lines[4], lines[5], lines[6], lines[7]);
    }
}