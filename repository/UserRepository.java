package repository;

import data.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {

    E findByFio(String fio);
    E findByAge (Integer age);
    boolean removeUserByFio (String fio);
    void removeUser (E entity);
}