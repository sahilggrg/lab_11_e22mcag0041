import java.util.Scanner;

public class PizzaOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.print("How many pizzas would you like to order, " + name + "? ");
        int num_pizzas = input.nextInt();
        input.nextLine(); // consume the remaining newline character
        
        System.out.print("What style of pizza would you like, " + name + "? (GreekPizza, ChicagoPizza, NewYorkStylePizza or SicilianPizza ) ");
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

class Cheese {
    private String name;
    private double cost;
    
    public Cheese(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    
    public String getName() {
        return name;
    }
    
    public double getCost() {
        return cost;
    }
    
    public static Cheese selectCheese(Scanner input, String name) {
        System.out.print("What type of cheese would you like, " + name + "? (mozzarella, Provolone, Reggiano, or Parmesan) ");
        String cheese_name = input.nextLine();
        switch (cheese_name.toLowerCase()) {
            case "Reggiano":
                return new Cheese("Reggiano", 1.99);
            case "Provolone":
                return new Cheese("Provolone", 1.58);
            case "Parmesan":
                return new Cheese("Parmesan", -0.99);
            default:
                return new Cheese("Mozzarella", 0.00);
        }
    }
}

class Sauce {
    private String name;
    private double cost;
    
    public Sauce(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    
    public String getName() {
        return name;
    }
    
    public double getCost() {
        return cost;
    }
    
    public static Sauce selectSauce(Scanner input, String name) {
        System.out.print("What type of sauce would you like, " + name + "? (marinara, PlumTomato, Barbecue, or Pumpkin) ");
        String sauce_name = input.nextLine();
        switch (sauce_name.toLowerCase()) {
            case "PlumTomato":
                return new Sauce("PlumTomato", 1.99);
            case "Barbecue":
                return new Sauce("Barbecue", 1.58);    
            case "Pumpkin":
                return new Sauce("Pumpkin", 1.16);
            default:
                return new Sauce("Marinara", 0.00);
        }
    }
}

class Crust {
    private String name;
    private double cost;
    
    public Crust(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    
    public String getName() {
    return name;
}

public double getCost() {
    return cost;
}

public static Crust selectCrust(Scanner input, String name) {
    System.out.print("What type of crust would you like, " + name + "? (thin, thick, or stuffed) ");
    String crust_name = input.nextLine();
    switch (crust_name.toLowerCase()) {
        case "thick":
            return new Crust("Thick", 1.99);
        case "stuffed":
            return new Crust("Stuffed", 2.99);
        default:
            return new Crust("Thin", 0.00);
    }
}
}

class Pizza {
private String style;
private Cheese cheese;
private Sauce sauce;
private Crust crust;
private int num_toppings;
public Pizza(String style, Cheese cheese, Sauce sauce, Crust crust, int num_toppings) {
    this.style = style;
    this.cheese = cheese;
    this.sauce = sauce;
    this.crust = crust;
    this.num_toppings = num_toppings;
}

public double getCost() {
    double cost = 5.00; // base cost of pizza
    
    if (style.equalsIgnoreCase("gourmet")) {
        cost += 2.00; // additional cost for gourmet style
    }
    
    cost += cheese.getCost() + sauce.getCost() + crust.getCost();
    cost += num_toppings * 0.50; // additional cost per topping
    
    return cost;
}
}