public class Car extends Vehicle{
private String VehicleIDNumber;

public Car(String VehicleIDNumber, double price, String color, String make, String model){
    super(price, color, make, model);
    this.VehicleIDNumber = VehicleIDNumber;
}
public String getDescription(){
    return ("Vehicle ID Number: " + super.getDescription() + VehicleIDNumber);
}