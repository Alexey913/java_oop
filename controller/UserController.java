package controller;

import data.User;

public interface UserController<E extends User, I> extends Controller<E, I> {
    E read(E entity);

    E create(E entity);

    E findUserByFio(String fio);
}