import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        // input user's pizza order and then display the pizza using toString method
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Type of Pizza: Cheese or Pepper");
        String type = in.next();
        Pizza pizza = PizzaFactory.orderPizza(type);
        System.out.println(pizza);
    }
}
