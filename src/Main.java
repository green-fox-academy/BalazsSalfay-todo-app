import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    TaskHandler todolist = new TaskHandler();

    if (args.length == 0) {
      System.out.println("\n" +
              "Command Line Todo application\n" +
              "=============================\n" +
              "\n" +
              "Command line arguments:\n" +
              "  -l   Lists all the tasks\n" +
              "  -a   Adds a new task\n" +
              "  -r   Removes a task\n" +
              "  -c   Completes a task");
    } else if (args[0].equals("-l")) {
      todolist.listTheTasks(args);
    } else if (args[0].equals("-a")) {
      todolist.addNewTask(args);
    } else if (args[0].equals("-r")) {
      todolist.removeTask(args);
    } else if (args[0].equals("-c")) {
      //complete a task 'function'
    }

  }
}
