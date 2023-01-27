package service;

import data.Teacher;

public interface TeacherService extends DataService<Teacher> {
    void removeUserByDiscipline(String discipline);
}