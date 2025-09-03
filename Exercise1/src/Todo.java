import java.time.LocalDateTime;

public class Todo {
    final private String title;
    private String desc;
    private LocalDateTime lastUpdated;
    private boolean finished;
    final private Priority priority;

    public Todo(String title, String desc, Priority priority) {
        this.title = title;
        this.priority = priority;
        this.desc = desc;
        this.lastUpdated = LocalDateTime.now();
        this.finished = false;
    }

    public Todo(String title, String desc) {
        this(title, desc, Priority.LOW);
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public boolean isFinished() {
        return finished;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
        this.lastUpdated = LocalDateTime.now();
    }

    public void setDesc(String newDesc) {
        this.desc += newDesc;
        this.lastUpdated = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Todo{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", lastUpdated=" + lastUpdated +
                ", finished=" + finished +
                ", priority=" + priority +
                '}';
    }
}
