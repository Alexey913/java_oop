package OOP_1;

import java.util.List;

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
    

    void getProduct (String name) {

    }

    void restore () {
        System.out.println("Произведите оплату");
    }

}
