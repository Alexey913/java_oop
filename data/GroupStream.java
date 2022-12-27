// Д/З Семинар 3
// Создать класс GroupStream, содержащий в себе список StudentGroup
// и реализующий интерфейс Iterable<StudentGroup>

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
