package ru.seminar.hw.oop4.model;

public class Task {
    private String id = "";
    private String title;
    private String description;
    private String date;
    private String time;
    private String deadline;
    private String fullname;
    private String level;

    public Task(String title,String description,String fullname, String date, String time, String deadline, String level) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.time = time;
        this.deadline = deadline;
        this.fullname = fullname;
        this.level = level;
    }

    public Task(String id, String title,String description, String fullname, String date, String time, String deadline, String level) {
        this(title, description, fullname, date, time, deadline, level);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Идентафикатор: %s\nЗаголовок: %s,\nОписание: %s,\nОтветственный: %s\nДата: %s\n" +
                "Время: %s\nДедлайн: %s\nПриоритет: %s", id, title, description, fullname, date, time, deadline, level);
    }
}
