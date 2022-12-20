// package OOP_1;

import java.util.List;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    

    public static List <Product> initProducts (Product item, List <Product> listProd) {
        listProd.add(item);
        return listProd;
    }
    

    public static Product getProduct (String name, List <Product> listProd) {
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
            System.out.println("Продукт " + name + " не найден!");
        }
        return productForSale;
    }

    void restore (String name) {
        System.out.println("Произведите оплату продукта " + name + "! (введите сумму)");
    }
}
