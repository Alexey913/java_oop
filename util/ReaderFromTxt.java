// Семинар 2 - Задача 1.2
// Создать классы WriterToTxt и ReaderFromTxt, имеющие
// статичные методы для записи/чтения в/из txt.файла


// Д/З Семинар 2
// 1. Создать класс StudentGroup, содержащая в себе поля Teacher и список студентов.
// 2. Создать класс StudentGroupServiceImpl, в котором реализована
// логика чтения Студентов и Преподавателя из файла txt (реализация чтения файла опциональна),
// создания класса StudentGroup и возвращения его.
// 3. Создать метод в Controller createGroup(int groupNumber),
// в который передается номер группы, а возвращается StudentGroup.
// 4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре.

// Д/З Семинар 4
// Реализовать класc TeacherRepository (обобщение на ваше усмотрение)
// Обобщить интерфейс DataService, чтобы он работал только с наследникам класса User
// Реализовать методы поиска и сохранения в классе TeacherService
// Реализовать как можно более обобщенный интерфейс Controller
// Создать классы StudentController, TeacherController, GroupController с методами сохранения и поиска соответствующих объектов
// * Реализовать такой же функционал для класса GroupStream


// Для всех задач, кроме Д/З Семинар 4
// package util;

// import java.util.List;

// import data.Student;
// import data.Teacher;
// import data.User;

// public class ReaderFromTxt {

// // К Семинару 2  - Задача 1.2
//     public static User read(User user) {
//         return user;
//     }

// // К Д/З Семинар 2
//     public static Teacher readTeacher() {
//         return null;
//     }

//     public static List <Student> readStudents () {
//         return null;
//     }
// }

// Для Д/З Семинар 4
package util;

import java.util.List;

import data.User;

public class ReaderFromTxt {

    public static <U extends User> U read(U user) {
        return user;
    }

    public static <U extends User> U readTeacher() {
        return null;
    }

    public static <U> List <U> readStudents () {
        return null;
    }
}