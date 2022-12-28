// Д/З Семинар 3
// Создать класс GroupStream, содержащий в себе список StudentGroup
// и реализующий интерфейс Iterable<StudentGroup>


package data.iterator;

import java.util.Iterator;
import java.util.List;

import data.StudentGroup;

public class GroupStreamIterator implements Iterator <StudentGroup> {

    private List <StudentGroup> groupStream;
    private int cursor;

    public GroupStreamIterator(List <StudentGroup> groupStream) {
        this.groupStream = groupStream;
    }

    @Override
    public boolean hasNext() {
        return cursor < groupStream.size();
    }

    @Override
    public StudentGroup next() {
        return groupStream.get(cursor++);
    }

    @Override
    public void remove() {
        this.groupStream.remove(cursor);
    }
}