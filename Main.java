// package OOP_1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите категорию продукта\n 1-Еда и холодные напитки\n 2-Горячие напитки");
        int answer = sc.nextInt();
        switch(answer) {
            case 1:
               productMethod();
               break;
            case 2:     
                hotDrinksMethod();
                break;
            default:
                System.out.println("Неверный ввод!");
        }
    }
    
    // Метод для выдачи продукта (еда или напиток)
    public static void productMethod () {
        List <Product> listProduct = new ArrayList<>();
        VendingMachine.initProducts(listProduct);
        
        for (Product prod : listProduct) {
            System.out.println(prod);
        }
        Scanner gp = new Scanner(System.in);
        System.out.println("Введите название продукта");
        String name = gp.nextLine();
        
        Product productForSale = VendingMachine.getProduct(name, listProduct);

        List <VendingMachine> machine = new ArrayList <> ();
        machine.add (new VendingMachine());
        machine.add (new MachineComplete());
        machine.add (new MachineError());

        if (productForSale.getName().equals("")) {
            System.out.println("Попробуйте снова!");
        }
        else {
            machine.get(0).restore();
        
            int price = gp.nextInt();
            if (price>=productForSale.getPrice()) {
                machine.get(1).restore();
            }
            else {
                machine.get(2).restore();
            }
        }
    }
    
    // Метод для выдачи горячего напитка
    public static void hotDrinksMethod () {
        List <HotDrinks> listHotDrinks = new ArrayList<>();
        HotDrinks capuchino = new HotDrinks ("Капучино", 90, 300, 75);
        HotDrinks latte = new HotDrinks ("Латте", 100, 350, 70);
        HotDrinks espresso = new HotDrinks ("Эспрессо", 70, 200, 80);
        HotDrinks choc = new HotDrinks ("Горячий шоколад", 90, 250, 60);
        HotDrinks hotDrinksForSale = new HotDrinks ("",0,0,0);
        listHotDrinks.add (capuchino);
        listHotDrinks.add (latte);
        listHotDrinks.add (espresso);
        listHotDrinks.add (choc);
        
        for (HotDrinks hot : listHotDrinks) {
            System.out.println(hot);
        }
        
        HotDrinksVendingMachine machineForName = new HotDrinksVendingMachine();
        HotDrinksVendingMachine machineForParametrs = new HotDrinksVendingMachine();
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите пункт меню:\n1-Выбрать напиток по названию\n2-Выбрать напиок по параметрам");
        int answer = sc.nextInt();
        int check = 1;
        switch(answer) {
            case 1:
                String nameHot = machineForName.enterData("название");
                hotDrinksForSale = machineForName.getProduct (nameHot);
                for (HotDrinks hot : listHotDrinks) {
                    if (nameHot.equals(hot.getName())) {
                        hotDrinksForSale.setPrice(hot.getPrice());
                        hotDrinksForSale.setVolume(hot.getVolume());
                        hotDrinksForSale.setTemperature(hot.getTemperature());
                        check = 1;
                    }
                    else {
                        check = 0;
                    }
                }
                break;
            case 2:     
                nameHot = machineForParametrs.enterData("название");
                String volumeHot = machineForParametrs.enterData("объем");
                String temperature = machineForParametrs.enterData("температуру");
                hotDrinksForSale = machineForParametrs.getProduct (nameHot, Double.parseDouble(volumeHot), Integer.parseInt(temperature), listHotDrinks);
                break;
            default:
                System.out.println("Неверный ввод!");
        }
        
        if (hotDrinksForSale.getName().equals("") || check == 0) {
            System.out.println("Напиток не найден!");
        }
        else {
            machineForName.restore();
            int price = sc.nextInt();
            if (price>=hotDrinksForSale.getPrice()) {
                machineForName.restore();
            }
            else {
                machineForName.restore();
            }
        }
        
    }
}
