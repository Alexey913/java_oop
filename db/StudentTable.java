package db;

import data.Student;

public class StudentTable extends Table<Student> {
    public boolean removeUserByFio(String fio) {
        for (Student student : elements) {
            if (student.getFio().equals(fio)) {
                elements.remove(student);
                return true;
            }
        }
        for (Student student : elements) {
            System.out.println(student);
        }
        return false;
    }
}