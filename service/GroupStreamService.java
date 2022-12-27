// Д/З Семинар 3
// Создать класс GroupStreamServiceImpl, добавив в него метод
// сортировки списка потоков, используя созданный GroupStreamComparator
// Модифицировать класс Controller, добавив в него созданный сервис
// Модифицировать класс Controller, добавив в него метод,
// сортирующий список потоков, путем вызова созданного сервиса

package service;

import java.util.List;

import data.GroupStream;

public interface GroupStreamService {
    void sortGroupStream (List <GroupStream> groupStream);
}
