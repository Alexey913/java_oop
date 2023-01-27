// ДЗ - Семинар 5

// - Повторить функционал с семинара №5
// - Реализовать команды для терминального клиента:
// удалить студента по имени
// удалить студента по номеру группы и возрасту
// * Продумать логику отображения результата выполнения команды

package terminal.terminalExecute;

import service.StudentService;
import terminal.command.show.CommandStatus;

public class DelStudentByAgeGroupExecutable extends AbstractExecutable {
    private static final String COMMENT = "Команда УДАЛЕНИЕ СТУДЕНТА ПО ВОЗРАСТУ И ИМЕНИ ГРУППЫ ";
    private StudentService studentService;
    private Integer age;
    private Integer groupNumber;


    public DelStudentByAgeGroupExecutable(StudentService studentService, Integer age, Integer groupNumber) {
        this.studentService = studentService;
        this.age = age;
        this.groupNumber = groupNumber;
    }


    @Override
    public CommandStatus execute() {
        if (studentService.findUserByAge(age).getGroupNumber() == groupNumber) {
            studentService.removeUserByGroup(groupNumber);
            return createResult(true);
        }
        else return createResult(false);
    }

    @Override
    protected String getComment() {
        return COMMENT +
                "[возраст " + age + ", " +
                "группа " + groupNumber + "] ";
    }
}