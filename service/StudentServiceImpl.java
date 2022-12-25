/*Создать интерфейс DataService, описывающий реализацию конкретных
 * сервисов по управлению сущностями (create, read).
 * Создать для сущности Student отдельный Service,
 * реализующий интерфейс DataService.
 * Create и read операции реализуются путем вызова utils методов
 */

package service;

import data.User;
import repository.StudentRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class StudentServiceImpl implements DataService {
        
    private StudentRepository studentRepository;

    @Override
    public void create(User user) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public User read(User user) {
        // TODO Auto-generated method stub
        return null;
    }
    

}
