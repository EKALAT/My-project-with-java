package Pizza_DH;

    public class PizzaClient {
        public void run() {
            Circle circle = new Circle(10);
            Rectangle rectangle = new Rectangle(15, 8);

            Pizza pizza1 = new Pizza(12.99, circle);
            Pizza pizza2 = new Pizza(14.50, rectangle);

            System.out.println(pizza1);
            System.out.println(pizza2);

            PizzaDeal deal = new PizzaDeal();
            double dealPrice1 = deal.deal(pizza1);
            double dealPrice2 = deal.deal(pizza2);

            System.out.println("Deal price for pizza 1: $" + dealPrice1);
            System.out.println("Deal price for pizza 2: $" + dealPrice2);

            Pizza betterDeal = deal.betterDeal(pizza1, pizza2);
            System.out.println("The better deal is: " + betterDeal);
        }

        public static void main(String[] args) {
            PizzaClient client = new PizzaClient();
            client.run();
        }
    }