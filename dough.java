import java.util.Scanner;

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
