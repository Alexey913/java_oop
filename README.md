## Java - Объектно-ориентированное программирование (занятие 1).

### Семинар:
Создать торговый кофейный автомат, напитки в автомате должны содержать следующие данные: наименование, объем, температура, цена. Проинициализировать несколько напитков в классе main и торговый автомат, воспроизвести логику продажи  напитков. Сделать согласно принципам ООП, пройденным на семинаре

### Домашнее задание:
* Создать наследника реализованного класса HotDrink с дополнительным полем int температура.
* Создать класс HotDrinkVendingMachine, реализующий интерфейс VendingMachine и реализовать перегруженный метод getProduct(String name, double volume, double temperature), выдающий продукт соответствующего имени, объема и температуры.
* В main проинициализировать несколько экземпляров HotDrink и HotDrinkVendingMachine и воспроизвести логику заложенную в программе
* Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

### Совмещенный проект семинара 1 и домашнего задания №1.

В классах **Product** и **VendingMachine** реализованы соответствующие классы.
Классы **Drinks** и **Eat** - наследники класса _Product_.
Классы **MachineError**, **MachineComplete** - наследники класса _VendingMachine_.

В рамках ДЗ выполнено следующее:
Реализован класс-наследник **HotDrinks** от класса _Drinks_.
Реализован класс-наследник **HotDrinksVendingMachine** от класса _VendingMachine_, а также класс-наследник **HotDrinksError** от класса _HotDrinksVendingMachine_.

В классе Main реализовно меню торгового автомата с учетом работы на семинаре (метод **productMethod**) и домашнего задания (метод **hotDrinksMethod**).

**P.S.** Постарался максимально широко реализовать пройденнй материал, но код, кажется, получился сложноват для восприятия.

Реализация заданий остальных семинаров представлена [ЗДЕСЬ](https://github.com/Alexey913/java_oop.git)
