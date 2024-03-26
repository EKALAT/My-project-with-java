package Pizza_DH;

public class PizzaDeal {
    public double deal(Pizza pizza) {
        // Implement your discount logic here
        // This example applies a 10% discount
        return pizza.getPrice() * 0.9;
    }

    public Pizza betterDeal(Pizza pizza1, Pizza pizza2) {
        double deal1 = deal(pizza1);
        double deal2 = deal(pizza2);
        return deal1 < deal2 ? pizza1 : pizza2;
    }
}
