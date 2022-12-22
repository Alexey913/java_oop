// package OOP_1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите категорию продукта\n1-Еда и холодные напитки\n2-Горячие напитки");
        String answer = sc.nextLine();
        // sc.close();
        
        switch(answer) {
            case "1":
               productMethod();
               break;
            case "2":     
                hotDrinksMethod();
                break;
            default:
                System.out.println("Неверный ввод!");
        }
        sc.close();
    }
    
    // Метод для выдачи продукта (еда или напиток)
    public static void productMethod () {
        List <VendingMachine> machine = new ArrayList <> ();
        machine.add (new VendingMachine());
        machine.add (new MachineComplete());
        machine.add (new MachineError());
        
        List <Product> listProduct = new ArrayList<>();
        Product toy = new Product ("Кулон", 100);
            listProduct.add(toy);
        Product water = new Drinks ("Вода", 60, 500);
            VendingMachine.initProducts(water, listProduct);
        Drinks juice = new Drinks ("Сок", 80, 350);
            machine.get(0).initProducts(juice, listProduct);
        Eat chocolate = new Eat ("Шоколад", 70, 100);
            VendingMachine.initProducts(chocolate, listProduct);
        Product chips = new Eat ("Чипсы", 100, 60);
            VendingMachine.initProducts(chips, listProduct);
        
        for (Product prod : listProduct) {
            System.out.println(prod);
        }
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner gp = new Scanner(System.in, encoding);
        System.out.println("Введите название продукта");
        String name = gp.nextLine();
        gp.close();
        
        Product productForSale = VendingMachine.getProduct(name, listProduct);

        if (!productForSale.getName().equals("")) {
            machine.get(0).restore(productForSale.getName());
            int price = gp.nextInt();
            if (price>=productForSale.getPrice()) {
                machine.get(1).restore(productForSale.getName());
            }
            else {
                machine.get(2).restore(productForSale.getName());
            }
        }
    }
 
 
 /*
Создать наследника реализованного класса HotDrink с дополнительным полем int температура.
Создать класс HotDrinkVendingMachine, реализующий интерфейс VendingMachine
и реализовать перегруженный метод getProduct(String name, double volume, double temperature),
выдающий продукт соответствующего имени, объема и температуры.
В main проинициализировать несколько экземпляров HotDrink и HotDrinkVendingMachine
и воспроизвести логику заложенную в программе
Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */
 
    
    // Метод для выдачи горячего напитка
    public static void hotDrinksMethod () {
        HotDrinksVendingMachine initToName = new HotDrinksVendingMachine();
        HotDrinksVendingMachine initToParametres = new HotDrinksVendingMachine();
        HotDrinksVendingMachine error = new HotDrinksError();
        
        //Инициализация экземпляров класса HotDrinks разными способами
        List <HotDrinks> listHotDrinks = new ArrayList<>();
        HotDrinks capuchino = HotDrinksVendingMachine.initProducts("Капучино", 90, 300, 75);
            listHotDrinks.add (capuchino);
        HotDrinks latte = new HotDrinks ("Латте", 100, 350, 70);
            listHotDrinks.add (latte);
            listHotDrinks.add(HotDrinksVendingMachine.initProducts("Эспрессо", 70, 200, 80));
            listHotDrinks.add(initToName.initProducts("Горячий шоколад", 90, 250, 60));
        HotDrinks hotDrinksForSale = new HotDrinks ("",0,0,0);


        for (Product hot : listHotDrinks) {
            System.out.println(hot);
        }
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите пункт меню:\n1-Выбрать напиток по названию\n2-Выбрать напиток по параметрам");
        String answer = sc.nextLine();
        switch(answer) {
            case "1":
                String nameHot = enterData("название");
                hotDrinksForSale = initToName.getProduct (nameHot);
                for (HotDrinks hot : listHotDrinks) {
                    if (nameHot.equals(hot.getName())) {
                        hotDrinksForSale = hot;
                        // hotDrinksForSale.setName(hot.getName());
                        // hotDrinksForSale.setPrice(hot.getPrice());
                        // hotDrinksForSale.setVolume(hot.getVolume());
                        // hotDrinksForSale.setTemperature(hot.getTemperature());
                    }
                }
                break;
            
            case "2":     
                nameHot = enterData("название");
                String volumeHot = enterData("минимальный объем");
                String temperature = enterData("желаемую температуру");
                hotDrinksForSale = initToParametres.getProduct (nameHot, Double.parseDouble(volumeHot), Integer.parseInt(temperature), listHotDrinks);
                break;
            default:
                System.out.println("Неверный ввод!");
        }
        if (hotDrinksForSale.getName().equals("") || hotDrinksForSale.getPrice()==0) {
            error.restore(hotDrinksForSale.getName());
        }
        else {
            System.out.println(hotDrinksForSale);
            initToName.restore(hotDrinksForSale.getName());
            int price = sc.nextInt();
            if (price>=hotDrinksForSale.getPrice()) {
                initToParametres.resultPay(hotDrinksForSale.getName());
            }
            else {
                error.resultPay(hotDrinksForSale.getName());
            }
        }
        sc.close();
    }
    
    public static String enterData(String parametr) {
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner param = new Scanner(System.in, encoding);
        System.out.println("Введите " + parametr + " горячего напитка");
        String data = param.nextLine();
        return data;
    }
}
