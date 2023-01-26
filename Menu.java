import terminal.Command;

public class Menu {
    private final static String printMsg = "Для выполнения команды введите через пробел:\n" +
    "- " + Command.ADD + " - для создания учетной записи\n" +
    "- " + Command.DEL + " - для удаления учетной записи\n" + 
    "\tдля удаления по имени введите -name;\n" +
    "\tдля удаления по возрасту и номеру группы введите -age-group ->";

    public static void terminal() {
        System.out.println(printMsg);
    }
    
}
