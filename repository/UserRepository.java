// Семинар 4 - Задача 3
// - Создать интерфейс UserRepository<E  extends User,I> унаследовав его от Repository<E, I>
// - В интерфейс UserRepository<E,I> задать абстрактный метод E findByFio (String fio)
// - Создать класc StudentRepository имплементировав интерфейс UserRepository

package repository;

import data.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {

    public abstract E findByFio(String fio);
    public abstract E findByAge (Integer age);
}
