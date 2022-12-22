// package OOP_1;

import java.util.List;

public class HotDrinksVendingMachine extends VendingMachine {
    
    public static HotDrinks initProducts (String name, int price, double volume, int temperature) {
        HotDrinks product = new HotDrinks(name, price, volume, temperature);
        return product;
    }
    
    public HotDrinks getProduct (String name) {
        HotDrinks productForSale = new HotDrinks (name, 0, 0, 0);
        return productForSale;
    }

    public HotDrinks getProduct (String name, double volume, int temperature, List <HotDrinks> listHotDrinks) {
        HotDrinks hotDrinksForSale = new HotDrinks(name, 0, 0, 0);
        for (HotDrinks i : listHotDrinks) {
            if (i.getName().equals(name) && i.getVolume()>=volume && (i.getTemperature()-temperature <=10 && i.getTemperature()-temperature >=-10)) {
                // System.out.println(i);
                hotDrinksForSale = i;
            }
        }
        return hotDrinksForSale;
    }
    
    @Override
    void restore (String name) {
        System.out.println("Оплатите " + name + "! (введите сумму)");
    }
    
    void resultPay (String name) {
        System.out.println("Ваш " + name + " готов!");
    }
}
