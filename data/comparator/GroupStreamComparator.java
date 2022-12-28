// Д/З Семинар 3
// Создать класс GroupStreamComparator<GroupStream>,
// реализующий сравнение количества групп входящих в GroupStream


package data.comparator;

import java.util.Comparator;

import data.GroupStream;

public class GroupStreamComparator implements Comparator <GroupStream> {

    @Override
    public int compare(GroupStream groupStream1, GroupStream groupStream2) {
        return (Integer.compare(groupStream1.getgroupStream().size(), groupStream2.getgroupStream().size()));
    }
    
}
