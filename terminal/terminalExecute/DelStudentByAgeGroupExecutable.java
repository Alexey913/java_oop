// ДЗ - Семинар 5

// - Повторить функционал с семинара №5
// - Реализовать команды для терминального клиента:
// удалить студента по имени
// удалить студента по номеру группы и возрасту
// * Продумать логику отображения результата выполнения команды

package terminal.terminalExecute;

import service.StudentServiceImpl;

public class DelStudentByAgeGroupExecutable implements CommandExecutable{
    private StudentServiceImpl studentServiceImpl;
    private Integer age;
    private Integer groupNumber;


    public DelStudentByAgeGroupExecutable(StudentServiceImpl studentServiceImpl, Integer age, Integer groupNumber) {
        this.studentServiceImpl = studentServiceImpl;
        this.age = age;
        this.groupNumber = groupNumber;
    }


    @Override
    public void execute() {
        if (studentServiceImpl.findUserByAge(age).getGroupNumber() == groupNumber) {
            studentServiceImpl.removeUserByGroup(groupNumber);
        }
    }
}
