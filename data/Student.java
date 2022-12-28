// Семинар 2 - задача 1.1
// Создать абстрактный класс User и его наследники Student и Teacher 
// родитель имеет в себе общие данные (фио, год рождения, паспорт (серия и номер)),
// а наследники - собственные параметры (номер группы для Student, кафедра для Teacher)


// Семинар 3 - задача 3
// 1. Модифицировать класс Student, заставив его реализовать интерфейс Comparable
// 2. Реализовать контракт compareTo () со сравнением по году рождения студента
// 3. Модифицировать класс StudentGroupServiceImpl, добавив в него метод сортировки списка студентов
// 4. Модифицировать класс Controller, добавив в него метод сортировки списка студентов
// и вызывать в нем созданный метод из StudentGroupServiceImpl


package data;

public class Student extends User implements Comparable <Student> {

// К Д/З Семинар 2
    private int groupNumber;

// К Семинару 2 - Задача 1.1
    public Student(String fio, int birthYear, long passport, int groupNumber) {
        super(fio, birthYear, passport);
        this.groupNumber = groupNumber;
    }

// К Д/З Семинар 2
    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

// К Семинару 3 - Задача 3
    @Override
    public int compareTo (Student student) {
        if (this.getBirthYear() > student.getBirthYear()) return 1;
        if (this.getBirthYear() < student.getBirthYear()) return -1;
        return 0;
    }
    
}