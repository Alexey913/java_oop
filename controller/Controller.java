/*Создать класс Controller, содержащий в себе
 * необходимые интерфейсы в виде переменных, а в конструкторе
 * создать объекты конкретных реализаций.
 * Создать метод createStudent (Student), реализующий логику
 * путем вызова соответствующих методов интерфейсов:
 * Создание студента;
 * Запись в файл студента;
 * Стение того, что записали;
 * Возвращение в методе того, что прочли в файле*/


package controller;

import data.Student;
import service.DataService;
import service.StudentServiceImpl;

public class Controller {
    private DataService studentService;
    
    
    public Controller(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }


    public Student createStudents(Student student) {
        studentService.create(student);
        studentService.read(student);
        return student;
    }
    
}
