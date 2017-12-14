public class Task {
  private String title;
  private boolean isReady;

  @Override
  public String toString() {
    return "Task{" +
            "title='" + title + '\'' +
            ", isReady=" + isReady +
            '}';
  }

  public Task(String title) {
    this.title = title;

  }
}
