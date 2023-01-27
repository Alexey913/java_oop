package data;

public class Student extends User implements Comparable<Student> {

    private int groupNumber;

    public Student(String fio, int birthYear, long passport, int groupNumber, int id) {
        super(fio, birthYear, passport, id);
        this.groupNumber = groupNumber;
    }

    public Student(String fio) {
        super(fio);
    }

    public Student(String fio, int birthYear, int groupNumber) {
        super(fio, birthYear);
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public int compareTo(Student student) {
        if (this.getBirthYear() > student.getBirthYear())
            return 1;
        if (this.getBirthYear() < student.getBirthYear())
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "[Студент " +
                (getFio() != null ? getFio() : "") +
                (getBirthYear() != 0 ? " Год рождения: " + getBirthYear() : "") +
                (getGroupNumber() != 0 ? " Группа: " + getGroupNumber() : "") +
                ']';
    }
}