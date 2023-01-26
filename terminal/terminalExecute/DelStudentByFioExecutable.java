// ДЗ - Семинар 5

// - Повторить функционал с семинара №5
// - Реализовать команды для терминального клиента:
// удалить студента по имени
// удалить студента по номеру группы и возрасту
// * Продумать логику отображения результата выполнения команды


package terminal.terminalExecute;

import service.StudentService;

public class DelStudentByFioExecutable implements CommandExecutable{
    private StudentService studentService;
    private String fio;

    public DelStudentByFioExecutable(StudentService studentService, String fio) {
        this.studentService = studentService;
        this.fio = fio;
    }

    @Override
    public void execute() {
        this.studentService.removeUserByFio(fio);
    }
}
