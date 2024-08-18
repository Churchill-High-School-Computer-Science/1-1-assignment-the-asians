import java.util.ArrayList;

public class Main {

    // Instance Variables
    public static ArrayList<Vehicle> inventory;
    public static double profits = 0;
    public static final double taxRate = .0625;

    public static void main(String[] args) {

        inventory = new ArrayList<Vehicle>();
        inventory.add(new Car("JH4KA3160KC018606", 29999, "Gray", "Honda", "Accord"));
        inventory.add(new Boat("LIW6A133B911", 34595, "Red", "Misty Harbor Del Mar", "Viaggio"));
        inventory.add(new Plane("G-UZMB", 5500000, "White", "Boeing", "777-200ER"));

    }
}
