import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class TaskHandler {

  public void listTheTasks() {
    try {
      Path filePath = Paths.get("todo.txt");
      List<String> taskList = Files.readAllLines(filePath);
      for (int i = 0; i < taskList.size(); i++) {
        System.out.println(i + 1 + " - " + taskList.get(i));
      }
    } catch (Exception e) {
      System.out.println("Unable to read file: todo.txt");
    }
  }

  public void addNewTask(List<String> newTask) {
    try {
      Path filePath = Paths.get("todo.txt");
      Files.write(filePath, newTask, StandardOpenOption.APPEND);
    } catch (Exception e) {
      System.out.println("Unable to write file: todo.txt");
    }
  }

}
