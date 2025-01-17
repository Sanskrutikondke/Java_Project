package Pizza_Bill_Generator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(false);
        pizza.addExtraCheese();
        pizza.addExtraToppings();
        pizza.takeAway();
        pizza.getBill();

        DeluxPizza deluxPizza = new DeluxPizza(true);
        deluxPizza.getBill();
    }
}
