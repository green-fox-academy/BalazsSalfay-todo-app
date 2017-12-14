public class Main {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("\"Command Line Todo application\"\n" +
              "\"=============================\"\n" +
              "\n" +
              "        \"Command line arguments:\"\n" +
              "        \"-l   Lists all the tasks\"\n" +
              "        \"-a   Adds a new task\"\n" +
              "        \"-r   Removes a task\"\n" +
              "        \"-c   Completes a task\"");
    } else if (args[0] == "-l") {
      //print out the list 'function'
    } else if (args[0] == "-a") {
      //add nem task to the list 'function'
    } else if (args[0] == "-r") {
      //remove a task from the list 'function'
    } else if (args[0] == "-c") {
      //complete a task 'function'
    }

  }
}
