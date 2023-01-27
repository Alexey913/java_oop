package terminal.command.show;

public class ShowResultImpl implements ShowResult {

    @Override
    public void showCommandStatus(CommandStatus commandStatus) {
        System.out.println(commandStatus);
    }
}