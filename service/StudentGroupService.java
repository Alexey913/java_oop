// Д/З Семинар 2
// Создать класс StudentGroupServiceImpl, в котором реализована логика чтения Студентов и Преподавателя из файла txt
// (реализация чтения файла опциональна), создания класса StudentGroup и возвращения его.

package service;

import data.StudentGroup;


public interface StudentGroupService {

    StudentGroup read();
    StudentGroup read(int groupNumber);
    void removeStudent (String fio);
    void create (StudentGroup studentGroup);
    void sortYear (StudentGroup studentGroup);
    void sortToFio (StudentGroup studentGroup);

}
