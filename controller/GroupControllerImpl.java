// Д/З Семинар 4
// Реализовать класc TeacherRepository (обобщение на ваше усмотрение)
// Обобщить интерфейс DataService, чтобы он работал только с наследникам класса User
// Реализовать методы поиска и сохранения в классе TeacherService
// Реализовать как можно более обобщенный интерфейс Controller
// Создать классы StudentController, TeacherController, GroupController с методами сохранения и поиска соответствующих объектов
// * Реализовать такой же функционал для класса GroupStream

package controller;

import data.StudentGroup;
import service.StudentGroupServiceImpl;

public class GroupControllerImpl implements GroupController <StudentGroup, Integer> {

    private final StudentGroupServiceImpl studentGroupServiceImpl;

    public GroupControllerImpl(StudentGroupServiceImpl studentGroupServiceImpl) {
        this.studentGroupServiceImpl = studentGroupServiceImpl;
    }

    @Override
    public StudentGroup save(StudentGroup entity) {
        return studentGroupServiceImpl.saveGroup(entity);
    }

    @Override
    public StudentGroup findById(Integer id) {
        return studentGroupServiceImpl.findGroup(id);
    }

    @Override
    public void removeStudent (String fio) {
        this.studentGroupServiceImpl.removeStudent(fio);;
    }

    @Override
    public void sortByYear (StudentGroup studentGroup) {
        this.studentGroupServiceImpl.sortByYear(studentGroup);
    }
    
    @Override
    public void sortByFio (StudentGroup studentGroup) {
        this.studentGroupServiceImpl.sortByFio(studentGroup);
    }
}
