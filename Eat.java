// package OOP_1;

public class Eat extends Product{
   
    private double weigth;

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public Eat(String name, int price, double weigth) {
        super(name, price);
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return super.toString() + ". Вес - " + getWeigth() + " г";
    }
}
