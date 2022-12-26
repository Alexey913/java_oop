// Семинар 2
// Создать класс Controller, содержащий в себе необходимые интерфейсы в виде переменных,
// а в конструкторе создать объекты конкретных реализаций.
// Создать метод createStudent (Student), реализующий логику путем вызова соответствующих методов интерфейсов:
//  * Создание студента;
//  * Запись в файл студента;
//  * Чтение того, что записали;
//  * Возвращение в методе того, что прочли в файле


package controller;

import data.Student;
import data.StudentGroup;
import service.DataService;
import service.StudentGroupService;
import service.StudentServiceImpl;

public class Controller {
    private DataService studentService;
    private StudentGroupService studentGroupService;

    
    public Controller(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    public Controller(StudentGroupService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }


    public Student createStudents(Student student) {
        studentService.create(student);
        studentService.read(student);
        return student;
    }

// Д/З Семинар 2
// Создать метод в Controller createGroup(int groupNumber), в который передается номер группы, а возвращается StudentGroup.

    public StudentGroup returnGroup (int groupNumber) {
        return studentGroupService.read(groupNumber);
    }

// Семинар 3
// Модифицировать класс Controller, добавив в него метод удаления студента и вызвать в нем
// созданный метод из StudentGroupServiceImpl

    public void removeStudent (String fio) {
        studentGroupService.removeStudent(fio);
    }

// Семинар 3
// Модифицировать класс Controller, добавив в него метод сорторовки 
// списка студентов и вызвать в нем созданный метод из StudentGroupServiceImpl    

    public void sortToYear (StudentGroup studentGroup) {
        studentGroupService.sortYear(studentGroup);
    }

// Семинар 3
// Модифицировать класс Controller, добавив в него  метод сортировки студентов по ФИО и вызвать в нем метод,
// созданный в StudentGroupServiceImpl.

    public void sortToFio (StudentGroup studentGroup) {
        studentGroupService.sortToFio(studentGroup);
    }
}
