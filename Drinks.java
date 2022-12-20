// package OOP_1;

public class Drinks extends Product {
    
    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Drinks(String name, int price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + ". Объем - " + getVolume() + " мл";
    }
}
