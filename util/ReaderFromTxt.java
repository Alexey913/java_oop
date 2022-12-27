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


package util;

import java.util.List;

import data.Student;
import data.Teacher;
import data.User;

public class ReaderFromTxt {

// К Семинару 2  - Задача 1.2

    public static User read(User user) {
        return user;
    }

// К Д/З Семинар 2

    public static Teacher readTeacher() {
        return null;
    }

    public static List <Student> readStudents () {
        return null;
    }
}