package terminal.command.show;

public class CommandStatus {
    private final String comment;
    private Boolean isDone;

    public CommandStatus(boolean isDone, String comment) {
        this.isDone = isDone;
        this.comment = comment;
    }

    public CommandStatus(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        if (isDone == null) {
            return comment;
        }
        return comment + (isDone ? "выполнена" : "не выполнена");
    }
}