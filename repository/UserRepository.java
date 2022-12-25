package repository;

import data.User;

/*
- Создать интерфейс UserRepository<U  extends User,I> унаследовав его от Repository<E, I>
- В интерфейс UserRepository<E,I> задать абстрактный метод E findByFio (String fio)
- Создать класc StudentRepository имплементировав интерфейс UserRepository
 */
interface UserRepository <E extends User, I> extends Repository <E, I> {
    abstract E findByFio (String fio);
}
