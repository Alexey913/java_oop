// ДЗ - Семинар 5

// - Повторить функционал с семинара №5
// - Реализовать команды для терминального клиента:
// удалить студента по имени
// удалить студента по номеру группы и возрасту
// * Продумать логику отображения результата выполнения команды


package terminal.terminalExecute;

import service.StudentService;
import terminal.CommandResult;

public class DelStudentByFioExecutable extends AbstractCommandExecutable {
    private static final String DESCRIPTION = "Команда УДАЛЕНИЕ СТУДЕНТА ПО ФИО ";

    private StudentService studentService;
    private String fio;

    public DelStudentByFioExecutable(StudentService studentService, String fio) {
        this.studentService = studentService;
        this.fio = fio;
    }

    @Override
    public CommandResult execute() {
        boolean check = this.studentService.removeUserByFio(fio);
        return createResult(check);
    }

    @Override
    protected String getDescription() {
        return DESCRIPTION +
                "[Студент " + fio +"] ";
    }
}
