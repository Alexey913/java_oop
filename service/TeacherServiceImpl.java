// Семинар 2
// Создать интерфейс DataService, описывающий реализацию конкретных
// сервисов по управлению сущностями (create, read).
// Создать для сущности Student отдельный Service,
// реализующий интерфейс DataService.
// Create и read операции реализуются путем вызова utils методов


package service;

import data.User;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class TeacherServiceImpl implements DataService {
    
    @Override
    public void create(User user) {
        WriterToTxt.write(user);
        
    }

    @Override
    public User read(User user) {
        ReaderFromTxt.read(user);
        return user;
    }
}
