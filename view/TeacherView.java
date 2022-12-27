// Семинар 2 - Задача 2
// Создать абстрактный класс или интерфейс UserView,
// содержащий в себе метод void showTheBest(List <User> userList),
// внутри вызывающий абстрактный метод User findTheBest(List <User> userList)
// и распечатывающий результат.
// Создать класс StudentView, унаследованный от UserView, содержащий
// в себе реализацию findTheBest


package view;

import java.util.List;

import data.User;

public class TeacherView extends UserView {

    @Override
    protected User userFindTheBest(List<User> userList) {
        //логика для учителя
        return null;
    }
    
}
