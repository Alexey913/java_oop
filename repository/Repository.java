/*- Создать пекедж repository. Дальнейшие работы ведем в нем
- Реализовать в нем интерфейс Repository<E,I>
- Задать в созданном интерфейсе 2 абстрактных метода:
E save(E entity)
E findById (I id)
- Создать класс GroupRepository, имплементировав его от Repository
 */

package repository;

import data.StudentGroup;

public interface Repository <E, I> {

    abstract StudentGroup save (E entity);

    abstract E findById (I id);
}
