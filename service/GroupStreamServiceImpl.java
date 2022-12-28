// Д/З Семинар 3
// Создать класс GroupStreamServiceImpl, добавив в него метод
// сортировки списка потоков, используя созданный GroupStreamComparator


package service;

import java.util.Collections;
import java.util.List;

import data.GroupStream;
import data.comparator.GroupStreamComparator;

public class GroupStreamServiceImpl implements GroupStreamService{

    @Override
    public void sortGroupStream(List <GroupStream> groupStream) {
        Collections.sort(groupStream, new GroupStreamComparator());
    }
}



