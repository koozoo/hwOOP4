package ru.seminar.hw.oop4;

import ru.seminar.hw.oop4.controllers.TaskController;
import ru.seminar.hw.oop4.model.FileOperation;
import ru.seminar.hw.oop4.model.FileOperationImpl;
import ru.seminar.hw.oop4.model.Repository;
import ru.seminar.hw.oop4.model.RepositoryFile;
import ru.seminar.hw.oop4.view.ViewTask;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("board.txt");
        Repository repository = new RepositoryFile(fileOperation);
        TaskController controller = new TaskController(repository);
        ViewTask view = new ViewTask(controller);
        view.run();
    }
}