// Семинар 3
// Создать класс UserComparator, реализующий интерфейс Comporator <User>
// Реализовать котракт CompareTo() со сравнением по ФИО

package service;

import java.util.Comparator;

import data.User;

public class UserComparator implements Comparator <User> {

    @Override
    public int compare(User user1, User user2) {
        return user1.getFio().compareTo(user2.getFio());
    }
    
}
