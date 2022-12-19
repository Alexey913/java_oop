// package OOP_1;

public class HotDrinksMachineError extends HotDrinksVendingMachine {

    public HotDrinksMachineError() {
    }
    
    @Override
    void restore() {
        System.out.println ("Ошибка оплаты!");
    }
}
