// Семинар 4 - Задача 1
// - Создать пекедж repository. Дальнейшие работы ведем в нем
// - Реализовать в нем интерфейс Repository<E,I>
// - Задать в созданном интерфейсе 2 абстрактных метода:
// E save(E entity)
// E findById (I id)
// - Создать класс GroupRepository, имплементировав его от Repository


// Семинар 4 - Задача 2
// - Создать класс GroupRepository имплементировав его от Repository<Group, Integer>
// - В классе StudentGroupServiceImpl добавить новую переменную Repository<Group, Integer>
// - В классе StudentGroupServiceImpl  реализовать методы сохранения группы и поиска её по номеру 


package repository;

import data.StudentGroup;

public class GroupRepository implements Repository <StudentGroup, Integer> {

    @Override
    public StudentGroup save(StudentGroup entity) {
        return null;
    }

    @Override
    public StudentGroup findById(Integer id) {
        return null;
    }


    
}
