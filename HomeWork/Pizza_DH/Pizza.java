package Pizza_DH;
public class Pizza {
    private double price;
    private Ishape shape;

    public Pizza(double price, Ishape shape) {
        this.price = price;
        this.shape = shape;
    }

    public double getPrice() {
        return price;
    }

    public Ishape getShape() {
        return shape;
    }

    @Override
    public String toString() {
        return "Pizza with price: $" + price + ", " + shape;
    }
}