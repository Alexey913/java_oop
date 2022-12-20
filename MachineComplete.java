// package OOP_1;

public class MachineComplete extends VendingMachine {

    public MachineComplete() {
    }
    
    @Override
    void restore(String name) {
        System.out.println ("Заберите продукт "+ name +"!");
    }
}
