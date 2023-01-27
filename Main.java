import repository.StudentRepository;
import service.StudentService;
import service.StudentServiceImpl;
import terminal.StartMenu;
import terminal.TerminalReader;
import terminal.command.CommandParser;
import terminal.command.CommandParserImpl;
import terminal.command.show.ShowResult;
import terminal.command.show.ShowResultImpl;
import terminal.factories.CommandExecutableFactory;
import terminal.factories.CommandExecutableFactoryImpl;

public class Main {

    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();

        StudentService service = new StudentServiceImpl(repository);
        CommandExecutableFactory factory = new CommandExecutableFactoryImpl(service);
        CommandParser parser = new CommandParserImpl();
        ShowResult showResult = new ShowResultImpl();

        StartMenu.terminal();
        TerminalReader.getInstance(parser, factory, showResult).scanner();
    }
}