import java.util.Scanner;

public class PizzaOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.print("How many pizzas would you like to order, " + name + "? ");
        int num_pizzas = input.nextInt();
        input.nextLine(); // consume the remaining newline character
        
        System.out.print("What style of pizza would you like, " + name + "? (traditional or gourmet) ");
        String style = input.nextLine();
        
        Cheese cheese = Cheese.selectCheese(input, name);
        Sauce sauce = Sauce.selectSauce(input, name);
        Crust crust = Crust.selectCrust(input, name);
        
        System.out.print("How many toppings would you like per pizza, " + name + "? ");
        int num_toppings = input.nextInt();
        
        Pizza pizza = new Pizza(style, cheese, sauce, crust, num_toppings);
        double total_cost = num_pizzas * pizza.getCost();
        
        System.out.println("You have ordered " + num_pizzas + " " + style + " pizzas with the following options:");
        System.out.println("- Cheese: " + cheese.getName());
        System.out.println("- Sauce: " + sauce.getName());
        System.out.println("- Crust: " + crust.getName());
        System.out.println("You have also requested " + num_toppings + " toppings per pizza.");
        System.out.printf("Your total cost is $%.2f.", total_cost);
    }
}
