// Семинар 3 - Задача 4
// 1. Создать класс UserComparator реализующий интерфейс Comparator<User>
// 2. Реализовать контракт compareTo() со сравнением по ФИО
// 3. Модифицировать класс StudentGroupServiceImpl, добавив в него метод сортировки списка студентов по ФИО
// 4. Модифицировать класс Controller, добавив в него метод сортировки списка студентов
// по ФИО и вызывать в нем созданный метод из StudentGroupServiceImpl


package iterator;

import java.util.Comparator;

import data.User;

public class UserComparator implements Comparator <User> {

    @Override
    public int compare(User user1, User user2) {
        return user1.getFio().compareTo(user2.getFio());
    }
    
}
