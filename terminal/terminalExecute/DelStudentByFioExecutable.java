// ДЗ - Семинар 5

// - Повторить функционал с семинара №5
// - Реализовать команды для терминального клиента:
// удалить студента по имени
// удалить студента по номеру группы и возрасту
// * Продумать логику отображения результата выполнения команды


package terminal.terminalExecute;

import service.StudentService;
import terminal.command.show.CommandStatus;

public class DelStudentByFioExecutable extends AbstractExecutable {
    private static final String COMMENT = "Команда УДАЛЕНИЕ СТУДЕНТА ПО ФИО ";

    private StudentService studentService;
    private String fio;

    public DelStudentByFioExecutable(StudentService studentService, String fio) {
        this.studentService = studentService;
        this.fio = fio;
    }

    @Override
    public CommandStatus execute() {
        boolean check = this.studentService.removeUserByFio(fio);
        return createResult(check);
    }

    @Override
    protected String getComment() {
        return COMMENT +
                "[Студент " + fio +"] ";
    }
}
