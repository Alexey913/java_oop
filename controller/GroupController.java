package controller;

import data.StudentGroup;

public interface GroupController<E extends StudentGroup, I> extends Controller<E, I> {
    void removeStudent(String fio);

    void sortByYear(E entity);

    void sortByFio(E entity);
}