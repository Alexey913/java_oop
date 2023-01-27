package service;

import data.User;

public interface DataService<U extends User> {

    void create(U entity);

    U read(U entity);

    U saveUser(U entity);

    U findUserById(int id);

    U findUserByFio(String fio);

    U findUserByAge(int age);

    boolean removeUserByFio(String fio);

    void removeUser(U user);
}