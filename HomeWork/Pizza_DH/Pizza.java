package Pizza_DH;
public class Pizza{
    private double _price;
    private Ishape _shape;

    public Pizza(double _price, Ishape _shape) {
        this._price = _price;
        this._shape = _shape;
    }
    public double getPrice(){
        return _price;
    }
    public Ishape getShape() {
        return _shape;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "_price=" + _price +
                ", _shape=" + _shape +
                '}';
    }
}