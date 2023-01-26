import repository.StudentRepository;
import service.StudentService;
import service.StudentServiceImpl;
import terminal.CommandParser;
import terminal.CommandParserImpl;
import terminal.ResultView;
import terminal.ResultViewImpl;
import terminal.TerminalReader;
import terminal.factories.CommandExecutableFactory;
import terminal.factories.CommandExecutableFactoryImpl;

public class Main {

    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();
        
        StudentService service = new StudentServiceImpl(repository);
        CommandExecutableFactory factory = new CommandExecutableFactoryImpl(service);
        CommandParser parser = new CommandParserImpl();
        ResultView view = new ResultViewImpl();

        Menu.terminal();
        TerminalReader.getInstance(parser, factory, view).scanner();
    }
}
