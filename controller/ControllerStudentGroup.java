/*
Создать класс StudentGroup, содержащая в себе поля Teacher и список студентов.
Создать класс StudentGroupServiceImpl, в котором реализована логика чтения Студентов и Преподавателя из файла txt
(реализация чтения файла опциональна), создания класса StudentGroup и возвращения его.
Создать метод в Controller createGroup(int groupNumber), в который передается номер группы, а возвращается StudentGroup.
Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре.
*/

package controller;

import data.StudentGroup;
import service.StudentGroupService;

public class ControllerStudentGroup {
    public StudentGroupService studentGroupService;


    public ControllerStudentGroup(StudentGroupService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    public StudentGroup returnGroup (int groupNumber) {
        return studentGroupService.read(groupNumber);
    }
}
