import java.util.Scanner;

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

