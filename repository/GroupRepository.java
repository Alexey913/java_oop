package repository;
/*
  Создать класс GroupRepository имплементировав его от Repository<Group, Integer>
- В классе StudentGroupServiceImpl добавить новую переменную Repository<Group, Integer>
- В классе StudentGroupServiceImpl  реализовать методы сохранения группы и поиска её по номеру
 */

import data.StudentGroup;

public class GroupRepository implements Repository <StudentGroup, Integer> {

    @Override
    public StudentGroup save(StudentGroup entity) {

        return entity;
    }

    @Override
    public StudentGroup findById(Integer id) {

        return save(StudentGroup.);
    }

    
}
