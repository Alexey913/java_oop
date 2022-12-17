package OOP_1;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List <Product> listProduct = new ArrayList<>();
        VendingMachine.initProducts(listProduct);
        for (Product prod : listProduct) {
            System.out.println(prod);
        }

        List <VendingMachine> machine = new ArrayList <> ();
        machine.add (new VendingMachine());
        machine.add (new MachineComplete());

        for (VendingMachine mach : machine) {
            mach.restore();
        }



    }
}
