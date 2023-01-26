// Семинар 7 - Задача 2
// - Создать класс StudentTable 
// - Реализовать метод удаления по имени boolean removeByName (String name),
// который бы удалял студента из таблицы по имени
// - Создать в классе StudentRepository зависимость класса StudentTable 
// - Вызывать метод removeByName из одноименного метода класса StudentRepository


package db;

import data.Student;

public class StudentTable extends Table <Student> {
    public boolean removeUserByFio (String fio) {
        for (Student student: elements) {
            if (student.getFio().equals(fio)) {
                elements.remove(student);
                return true;
            }
        }
        for (Student student: elements) {
            System.out.println(student);
        }
        return false;
    }
}