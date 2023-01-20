// Семинар 2 - задача 1.1
// Создать абстрактный класс User и его наследники Student и Teacher 
// родитель имеет в себе общие данные (фио, год рождения, паспорт (серия и номер)),
// а наследники - собственные параметры (номер группы для Student, кафедра для Teacher)


package data;

public class Teacher extends User {
    
    private String discipline;

    public Teacher(String fio, int birthYear, long passport, String discipline, int id) {
        super(fio, birthYear, passport, id);
        this.discipline = discipline;
    }

    public String getdiscipline() {
        return discipline;
    }

    public void setdiscipline(String discipline) {
        this.discipline = discipline;
    }
   
}
