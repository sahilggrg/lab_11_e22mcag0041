import java.util.Scanner;

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
