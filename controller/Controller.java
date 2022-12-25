// Создать метод в Controller createGroup(int groupNumber),
//в который передается номер группы, а возвращается StudentGroup.


package controller;

import java.util.List;

import data.Student;
import data.StudentGroup;
import data.Teacher;
import data.User;
import service.GroupDataService;
import service.StudentGroupServiceImpl;

public class Controller {
    private GroupDataService studentGroupCreating;
    
    
    public Controller(StudentGroupServiceImpl studentGroupCreating) {
        this.studentGroupCreating = studentGroupCreating;
    }

/* Создаем требуемый метод
Здесь, кроме номера группы передал список студентов и Учителя,
чтобы упростить задачу. Предполагается, что будет некий список групп, 
и, проверяя через геттер номер группы в списке с принимаемым номером,
выводим группу в случае свопадения.
 */    
    public StudentGroup createGroup (int groupNumber, List <Student> listOfUser, User user) { 
        Teacher teacher = studentGroupCreating.readTeacher(user);
        List <Student> listOfStudents = studentGroupCreating.readStudents(listOfUser, user);
        StudentGroup group = studentGroupCreating.newGroup(listOfStudents, teacher, groupNumber);
        return group;
    }
}
