// Д/З Семинар 2
// Создать класс StudentGroup, содержащая в себе поля Teacher и список студентов.
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре.

package data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import service.StudentGroupIterator;

public class StudentGroup implements Iterable <Student> {
    
    Teacher teacher;
    List <Student> listOfStudents = new ArrayList<>();
    int groupNumber;


    public StudentGroup(Teacher teacher, List<Student> listOfStudents) {
        this.teacher = teacher;
        this.listOfStudents = listOfStudents;
    }


    public StudentGroup(Teacher teacher, List<Student> listOfStudents, int groupNumber) {
        this.teacher = teacher;
        this.listOfStudents = listOfStudents;
        this.groupNumber = groupNumber;
    }


    public Teacher getTeacher() {
        return teacher;
    }
    
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
   
   
    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }
    

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }


// Семинар 3
// Модернизировать класс StudentGroup, заставив его реализовать интерфейс Iterable<Student>
// Реализовать метод iterator(), возвращающий экземпляр созданного нами итератора

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
