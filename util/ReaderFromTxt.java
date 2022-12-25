/* Создать классы WriterToTxt и ReaderFromTxt, имеющие
 * статичные методы для записи/чтения в/из txt.файла*/

package util;

import java.util.List;

import data.Student;
import data.StudentGroup;
import data.Teacher;
import data.User;

public class ReaderFromTxt {

    public static User read(User user) {
        return user;
    }

    public static Teacher readTeacher() {
        return teacher;
    }

    public static List <Student> readToList (List <Student> listOfUser, Student student) {
        listOfUser.add(student);
        return listOfUser;
    }

    public static StudentGroup readStudentGroup(StudentGroup studentGroup) {
        return null;
    }

    public static List<Student> readStudents() {
        return null;
    }
}
