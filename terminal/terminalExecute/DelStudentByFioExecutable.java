// ДЗ - Семинар 5

// - Повторить функционал с семинара №5
// - Реализовать команды для терминального клиента:
// удалить студента по имени
// удалить студента по номеру группы и возрасту
// * Продумать логику отображения результата выполнения команды


package terminal.terminalExecute;

import service.StudentServiceImpl;

public class DelStudentByFioExecutable implements CommandExecutable{
    private String fio;
    private StudentServiceImpl studentServiceImpl;


    public DelStudentByFioExecutable(String fio) {
        this.fio = fio;
    }

    @Override
    public void execute() {
        this.studentServiceImpl.removeUserByFio(fio);
    }
}
