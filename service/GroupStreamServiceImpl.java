// Д/З Семинар 3
// Создать класс GroupStreamServiceImpl, добавив в него метод
// сортировки списка потоков, используя созданный GroupStreamComparator


// Д/З Семинар 4
// Реализовать класc TeacherRepository (обобщение на ваше усмотрение)
// Обобщить интерфейс DataService, чтобы он работал только с наследникам класса User
// Реализовать методы поиска и сохранения в классе TeacherService
// Реализовать как можно более обобщенный интерфейс Controller
// Создать классы StudentController, TeacherController, GroupController с методами сохранения и поиска соответствующих объектов
// * Реализовать такой же функционал для класса GroupStream


// Для Д/З Семинар 3

// package service;

// import java.util.Collections;
// import java.util.List;

// import data.GroupStream;
// import data.comparator.GroupStreamComparator;

// public class GroupStreamServiceImpl implements GroupStreamService{

//     @Override
//     public void sortGroupStream(List <GroupStream> groupStream) {
//         Collections.sort(groupStream, new GroupStreamComparator());
//     }
// }


// Для Д/З Семинар 4

package service;

import java.util.Collections;
import java.util.List;

import data.GroupStream;
import data.comparator.GroupStreamComparator;
import repository.Repository;

public class GroupStreamServiceImpl implements GroupStreamService<GroupStream, Integer>{

    private final Repository <GroupStream, Integer> groupStreamRepository;

    public GroupStreamServiceImpl(Repository <GroupStream, Integer> groupStreamRepository) {
        this.groupStreamRepository = groupStreamRepository;
    }

    @Override
    public void sortGroupStream(List <GroupStream> groupStream) {
        Collections.sort(groupStream, new GroupStreamComparator());
    }

    @Override
    public GroupStream createGroupStream(GroupStream entity) {
        return entity;
    }

    @Override
    public GroupStream saveGroupStream(GroupStream entity) {
        return this.groupStreamRepository.save(entity);
    }

    @Override
    public GroupStream findByIdGroupStream(Integer id) {
        return this.groupStreamRepository.findById(id);
    }
}