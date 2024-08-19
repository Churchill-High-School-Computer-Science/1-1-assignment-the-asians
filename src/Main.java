import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Instance Variables
    public static ArrayList<Vehicle> inventory = new ArrayList<>();
    public static double profits = 0;
    public static final double taxRate = .0625;
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double profits = 0;

        inventory = new ArrayList<Vehicle>();
        inventory.add(new Car("JH4KA3160KC018606", 29999, "Gray", "Honda", "Accord"));
        inventory.add(new Boat("LIW6A133B911", 34595, "Red", "Misty Harbor Del Mar", "Viaggio"));
        inventory.add(new Plane("G-UZMB", 5500000, "White", "Boeing", "777-200ER"));



        
    }
    public void sellVehicle(){
        for(int i = 0; i < inventory.size(); i++){
            System.out.println(i + inventory.get(i).getDescription());
        }
    }
       public void displayInventory(){
          getDe();

        }
       }



    

