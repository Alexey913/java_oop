package terminal;

public class CommandResult {
    private final String description;
    private Boolean isSuccess;

    public CommandResult(boolean isSuccess, String description) {
        this.isSuccess = isSuccess;
        this.description = description;
    }

    public CommandResult(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        if (isSuccess == null) return description;
        return description +
                (isSuccess ? "выполнена" : "не выполнена");
    }

}
