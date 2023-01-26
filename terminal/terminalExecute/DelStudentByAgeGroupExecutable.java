// ДЗ - Семинар 5

// - Повторить функционал с семинара №5
// - Реализовать команды для терминального клиента:
// удалить студента по имени
// удалить студента по номеру группы и возрасту
// * Продумать логику отображения результата выполнения команды

package terminal.terminalExecute;

import service.StudentService;

public class DelStudentByAgeGroupExecutable implements CommandExecutable{
    private StudentService studentService;
    private Integer age;
    private Integer groupNumber;


    public DelStudentByAgeGroupExecutable(StudentService studentService, Integer age, Integer groupNumber) {
        this.studentService = studentService;
        this.age = age;
        this.groupNumber = groupNumber;
    }


    @Override
    public void execute() {
        if (studentService.findUserByAge(age).getGroupNumber() == groupNumber) {
            studentService.removeUserByGroup(groupNumber);
        }
    }
}
