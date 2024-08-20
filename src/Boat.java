public class Boat extends Vehicle{
private String HullIDNumber;

public Boat(String HullIDNumber, double price, String color, String make, String model){
super(price, color, make, model);
this.HullIDNumber = HullIDNumber;

}
public String getDescription(){
    return ("Hull ID Number: " + super.getDescription() + HullIDNumber);
}
}