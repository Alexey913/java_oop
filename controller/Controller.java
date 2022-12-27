// Семинар 2 - Задача 3
// Создать класс Controller, содержащий в себе необходимые интерфейсы в виде переменных,
// а в конструкторе создать объекты конкретных реализаций.
// Создать метод createStudent (Student), реализующий логику
// путем вызова соответствующих методов интерфейсов:
//  * Создание студента;
//  * Запись в файл студента;
//  * Чтение того, что записали;
//  * Возвращение в методе того, что прочли в файле


// Д/З Семинар 2
// 1. Создать класс StudentGroup, содержащая в себе поля Teacher и список студентов.
// 2. Создать класс StudentGroupServiceImpl, в котором реализована
// логика чтения Студентов и Преподавателя из файла txt (реализация чтения файла опциональна),
// создания класса StudentGroup и возвращения его.
// 3. Создать метод в Controller createGroup(int groupNumber),
// в который передается номер группы, а возвращается StudentGroup.
// 4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре.


// Семинар 3 - Задача 2
// 1. Модифицировать класс StudentGroup, заставив его реализовать интерфейс Iterable<Student>
// 2. Реализовать метод iterator() возвращающий экземпляр созданного нами итератора
// 3. Модифицировать класс StudentGroupServiceImpl, добавив в него метод удаления студента по ФИО
// 4. Модифицировать класс Controller, добавив в него метод удаления студента
// и вызывать в нем созданный метод из StudentGroupServiceImpl


// Семинар 3 - задача 3
// 1. Модифицировать класс Student, заставив его реализовать интерфейс Comparable
// 2. Реализовать контракт compareTo () со сравнением по году рождения студента
// 3. Модифицировать класс StudentGroupServiceImpl, добавив в него метод сортировки списка студентов
// 4. Модифицировать класс Controller, добавив в него метод сортировки списка студентов
// и вызывать в нем созданный метод из StudentGroupServiceImpl


// Семинар 3 - Задача 4
// 1. Создать класс UserComparator реализующий интерфейс Comparator<User>
// 2. Реализовать контракт compareTo() со сравнением по ФИО
// 3. Модифицировать класс StudentGroupServiceImpl, добавив в него метод сортировки списка студентов по ФИО
// 4. Модифицировать класс Controller, добавив в него метод сортировки списка студентов
// по ФИО и вызывать в нем созданный метод из StudentGroupServiceImpl


// Д/З Семинар 3
// 1. Создать класс GroupStream, содержащий в себе список StudentGroup
// и реализующий интерфейс Iterable<StudentGroup>
// 2. Создать класс GroupStreamComparator<GroupStream>,
// реализующий сравнение количества групп входящих в GroupStream
// 3. Создать класс GroupStreamServiceImpl, добавив в него метод сортировки списка потоков,
// используя созданный GroupStreamComparator
// 4. Модифицировать класс Controller, добавив в него созданный сервис
// 5. Модифицировать класс Controller, добавив в него метод,
// сортирующий список потоков, путем вызова созданного сервиса


package controller;

import java.util.List;

import data.GroupStream;
import data.Student;
import data.StudentGroup;
import service.DataService;
import service.GroupStreamService;
import service.StudentGroupService;
import service.StudentServiceImpl;

public class Controller {

// К Семинару 2
    private DataService studentService;
    
// К Д/З Семинар 2
    private StudentGroupService studentGroupService;

// К Д/З Семинар 3
    private GroupStreamService groupStreamService;

// К Семинару 2
    public Controller(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

// К Д/З Семинар 2
    public Controller(StudentGroupService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

// К Д/З Семинар 3
    public Controller(GroupStreamService groupStreamService) {
        this.groupStreamService = groupStreamService;
    }

// К Семинару 2
    public Student createStudents(Student student) {
        studentService.create(student);
        studentService.read(student);
        return student;
    }

// К Д/З Семинар 2

    public StudentGroup returnGroup (int groupNumber) {
        return studentGroupService.read(groupNumber);
    }

// К Семинару 3 - Задача 2
    public void removeStudent (String fio) {
        studentGroupService.removeStudent(fio);
    }

// К Семинару 3 - Задача 3
    public void sortToYear (StudentGroup studentGroup) {
        studentGroupService.sortYear(studentGroup);
    }

// К Семинару 3 - Задача 4
    public void sortToFio (StudentGroup studentGroup) {
        studentGroupService.sortToFio(studentGroup);
    }

// К Д/З Семинар 3
    public void sortStream (List <GroupStream> groupStream) {
        groupStreamService.sortGroupStream(groupStream);
    }

}
