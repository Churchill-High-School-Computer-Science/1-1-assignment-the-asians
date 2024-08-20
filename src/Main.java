import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Instance Variables
    public static ArrayList<Vehicle> inventory = new ArrayList<>();
    public static double profits = 0;
    public static final double taxRate = .0625;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
       

        inventory = new ArrayList<Vehicle>();
        inventory.add(new Car("JH4KA3160KC018606", 29999, "Gray", "Honda", "Accord"));
        inventory.add(new Boat("LIW6A133B911", 34595, "Red", "Misty Harbor Del Mar", "Viaggio"));
        inventory.add(new Plane("G-UZMB", 5500000, "White", "Boeing", "777-200ER"));
        //call methods
        sellVehicle();
        displayInventory();


        //displays inventory and asks user to pick 
    }
    public static void sellVehicle(){
        for(int i = 0; i < inventory.size(); i++){
            System.out.println(i + inventory.get(i).getDescription());
            System.out.println("What's the index of the car you'd like to purchase? ");
            int index = scan.nextInt();
            if(index < inventory.size()){
                Vehicle vehicle = inventory.get(index);
                //generates cost of vehicle with tax
                double price = vehicle.getPrice();
                double totalCost = (price * taxRate) + price;
                System.out.print("The cost of the vehicle is " + totalCost);

                profits += price;
                inventory.remove(index);
            }
        }
    }// goes through and writes the description for vehicles in inventory
       public static void displayInventory(){
        for(int i = 0; i < inventory.size(); i++){
            inventory.get(0).getDescription();
        }
          
        }
       }
    
    

    

