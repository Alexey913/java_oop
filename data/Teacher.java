// Семинар 2 - задача 1.1
// Создать абстрактный класс User и его наследники Student и Teacher 
// родитель имеет в себе общие данные (фио, год рождения, паспорт (серия и номер)),
// а наследники - собственные параметры (номер группы для Student, кафедра для Teacher)

package data;

public class Teacher extends User {
    
    private String scince;


    public Teacher(String fio, int birthYear, long passport, String scince) {
        super(fio, birthYear, passport);
        this.scince = scince;
    }


    public String getScince() {
        return scince;
    }

    public void setScince(String scince) {
        this.scince = scince;
    }
   
}
