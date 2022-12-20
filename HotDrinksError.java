// package OOP_1;

public class HotDrinksError extends HotDrinksVendingMachine {

    public HotDrinksError() {
    }
    
    @Override
    void restore(String name) {
        System.out.println ("Напиток " + name + " не найден!");
    }
    
    @Override
    void resultPay (String name) {
        System.out.println("Недостаточно средств для оплаты " + name + "!");
    }
}
