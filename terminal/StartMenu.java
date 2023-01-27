package terminal;

import terminal.command.Command;

public class StartMenu {
    private final static String printMsg = "Для выполнения команды введите через пробел:\n" +
            "  " + Command.ADD + " - для создания учетной записи\n" +
            "\t- по имени введите: " + Command.NAME + ";\n" +
            "\t- по имени, возрасту и номеру группы введите: " + Command.NAMEAGEGROUP + " ->\n" +
            "  " + Command.DEL + " - для удаления учетной записи\n" +
            "\t- по имени введите: " + Command.NAME + ";\n" +
            "\t- по возрасту и номеру группы введите: " + Command.AGEGROUP + " ->";

    public static void terminal() {
        System.out.println(printMsg);
    }
}