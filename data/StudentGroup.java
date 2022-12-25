// Создать класс StudentGroup, содержащая в себе поля Teacher и список студентов.

package data;

import java.util.List;

public class StudentGroup {

    private List <Student> studentList;
    private Teacher teacher;
    private int groupNumber;

    
    public StudentGroup(Teacher teacher, List<Student> listOfStudent, int groupNumber) {
        this.studentList = listOfStudent;
        this.teacher = teacher;
        this.groupNumber = groupNumber;
    }


    public StudentGroup(Teacher teacher2, List<Student> listOfStudents) {
    }


    public List <Student> getStudentList() {
        return studentList;
    }
    
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    
    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
}