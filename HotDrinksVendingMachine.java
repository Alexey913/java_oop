import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class HotDrinksVendingMachine extends VendingMachine {
    
    public HotDrinksVendingMachine () {
    }


    static HotDrinks getProduct (String name) {
        HotDrinks productForSale = new HotDrinks (name, 0, 0, 0);
        return productForSale;
    }


    static HotDrinks getProduct (String name, double volume, int temperature, List <HotDrinks> listHotDrinks) {
        int count = 0;
        HotDrinks hotDrinksForSale = new HotDrinks("", 0, 0, 0);
        for (HotDrinks i : listHotDrinks) {
            if (i.getName().equals(name) && (i.getTemperature()-temperature <=10 && i.getTemperature()-temperature >=-10)) {
                System.out.println(i);
                count++;
                hotDrinksForSale = i;
            }
        }
        if (count==0) {
            System.out.println("Попробуйте снова!");
        }
        return hotDrinksForSale;
    }
    
    
    
    static String enterData(String parametr) {
        Scanner param = new Scanner(System.in);
        System.out.println("Введите " + parametr + " горячего напитка");
        String data = param.nextLine();
        return data;
    }
}
