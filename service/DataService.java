/* Создать интерфейс DataService, описывающий реализацию конкретных
 * сервисов по управлению сущностями (create, read).
 * Создать для сущности Student отдельный Service,
 * реализующий интерфейс DataService.
 * Create и read операции реализуются путем вызова utils методов
 */

package service;

import data.User;
public interface DataService {
    
    void create(User user);
    User read(User user);

}
