// package OOP_1;

public class MachineError extends VendingMachine {

    public MachineError() {
    }
    
    @Override
    void restore(String name) {
        System.out.println ("Недостаточно средств для оплаты продукта " + name + "!");
    }
}
