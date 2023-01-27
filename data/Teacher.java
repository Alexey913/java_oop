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