// Д/З Семинар 3
// 1. Создать класс GroupStream, содержащий в себе список StudentGroup
// и реализующий интерфейс Iterable<StudentGroup>
// 2. Создать класс GroupStreamComparator<GroupStream>,
// реализующий сравнение количества групп входящих в GroupStream
// 3. Создать класс GroupStreamServiceImpl, добавив в него метод сортировки списка потоков,
// используя созданный GroupStreamComparator
// 4. Модифицировать класс Controller, добавив в него созданный сервис
// 5. Модифицировать класс Controller, добавив в него метод,
// сортирующий список потоков, путем вызова созданного сервиса


package data;

import java.util.Iterator;
import java.util.List;

import iterator.GroupStreamIterator;

public class GroupStream implements Iterable <StudentGroup> {

    private List <StudentGroup> groupStream;
    
    public List<StudentGroup> getgroupStream() {
        return groupStream;
    }

    public void setgroupStream(List<StudentGroup> groupStream) {
        this.groupStream = groupStream;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupStreamIterator(this.groupStream);
    }
    
}
