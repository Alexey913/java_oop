// Д/З Семинар 3
// Создать класс GroupStreamServiceImpl, добавив в него метод
// сортировки списка потоков, используя созданный GroupStreamComparator
// Модифицировать класс Controller, добавив в него созданный сервис
// Модифицировать класс Controller, добавив в него метод,
// сортирующий список потоков, путем вызова созданного сервиса


// Д/З Семинар 4
// Реализовать класc TeacherRepository (обобщение на ваше усмотрение)
// Обобщить интерфейс DataService, чтобы он работал только с наследникам класса User
// Реализовать методы поиска и сохранения в классе TeacherService
// Реализовать как можно более обобщенный интерфейс Controller
// Создать классы StudentController, TeacherController, GroupController с методами сохранения и поиска соответствующих объектов
// * Реализовать такой же функционал для класса GroupStream


// Для Д/З Семинар 3
// package service;

// import java.util.List;

// import data.GroupStream;

// public interface GroupStreamService {
//     void sortGroupStream (List <GroupStream> groupStream);
    
// }


// Для Д/З Семинар 4
package service;

import java.util.List;

public interface GroupStreamService <E, I> {
    void sortGroupStream (List <E> entity);
    E saveGroupStream (E entity);
    E findByIdGroupStream (I id);
}