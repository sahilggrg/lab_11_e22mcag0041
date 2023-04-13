
import java.util.Scanner;

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