// package OOP_1;

public class MachineError extends VendingMachine {

    public MachineError() {
    }
    
    @Override
    void restore() {
        System.out.println ("Ошибка оплаты!");
    }
}
