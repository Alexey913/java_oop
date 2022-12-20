// package OOP_1;

public class HotDrinks extends Drinks {
    
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature (int temperature) {
        this.temperature = temperature;
    }

    public HotDrinks(String name, int price, double volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ". Темп. " + getTemperature() + " C";
    }
}
