// package OOP_1;

import java.util.List;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {

    static List <Product> initProducts (List <Product> listProd) {
        Product toy = new Product ("Кольцо", 100);
        Product water = new Drinks ("Вода", 60, 500);
        Drinks juice = new Drinks ("Сок", 80, 350);
        Eat chocolate = new Eat ("Шоколад", 70, 100);
        Product chips = new Eat ("Чипсы", 100, 60);
        listProd.add(toy);
        listProd.add(water);
        listProd.add(juice);
        listProd.add(chocolate);
        listProd.add(chips);
        return listProd;
    }
    

    static Product getProduct (String name, List <Product> listProd) {
        int count = 0;
        Product productForSale = new Product("", 0);
        for (Product i : listProd) {
            if (i.getName().equals(name)) {
                System.out.println(i);
                count++;
                productForSale = i;
            }
        }
        if (count==0) {
            System.out.println("Продукт не найден!");
        }
        return productForSale;
    }

    void restore () {
        System.out.println("Произведите оплату! (введите сумму)");
    }

}
