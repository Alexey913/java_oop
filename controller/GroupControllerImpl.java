package controller;

import data.StudentGroup;
import service.StudentGroupServiceImpl;

public class GroupControllerImpl implements GroupController<StudentGroup, Integer> {

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
    public void removeStudent(String fio) {
        this.studentGroupServiceImpl.removeStudent(fio);
        ;
    }

    @Override
    public void sortByYear(StudentGroup studentGroup) {
        this.studentGroupServiceImpl.sortByYear(studentGroup);
    }

    @Override
    public void sortByFio(StudentGroup studentGroup) {
        this.studentGroupServiceImpl.sortByFio(studentGroup);
    }
}