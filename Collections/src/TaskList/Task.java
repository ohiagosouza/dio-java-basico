package TaskList;

public class Task {
    private String description;

    public Task(String description) {
       this.description = description;
    };

    @Override
    public String toString() {
        return "Description: " + description + '\'';
    }

    public String getDescription() {
        return description;
    }
}
