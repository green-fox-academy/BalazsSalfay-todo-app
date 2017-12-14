import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class TaskHandler {
  Path filePath = Paths.get("todo.txt");
  List<String> todolist = new ArrayList<>();

  public void listTheTasks(String[] args) {
    try {
      if (todolist.size() != 0) {
        for (int i = 0; i < todolist.size(); i++) {
          System.out.println(i + 1 + " - " + todolist.get(i));
        }
      } else {
        System.out.println("No todos for today! :)");
      }
    } catch (Exception e) {
      System.out.println("Unable to read file: todo.txt");
    }
  }

  public void addNewTask(String[] args) {
    for (int i = 0; i < args.length; i++) {
      todolist.add(String.valueOf(i));
    }
    try {
      if (args.length <= 0) {
        Files.write(filePath, todolist, StandardOpenOption.APPEND);
      } else {
        System.out.println("Unable to add: no task provided");
      }
    } catch (Exception e) {
      System.out.println("Unable to write file: todo.txt");
    }
  }

  public void removeTask(String[] args) {
    int index;
    try {
      index = Integer.parseInt(args[1]);
      try {
        List<String> taskList = Files.readAllLines(filePath);
        if (index <= 0) {
          System.out.println("Unable to remove: no index provided");
        } else if (taskList.size() < index) {
          System.out.println("Unable to remove: index is out of bound");
        } else  {
          taskList.remove(index - 1);
        }
        Files.write(filePath,taskList);
      } catch (Exception e) {
        System.out.println("Unable to write: todo.txt");
      }
    } catch (Exception em) {
      System.out.println("Unable to remove: index is not a number");
    }
  }
}
