public class Plane extends Vehicle{
    private String tailIDNumber;

    public Plane(String tailIDNumber, double price, String color, String make, String model){
        super(price, color, make, model);
        this.tailIDNumber = tailIDNumber;
    }

    public String getDescription(){
        return ("Tail ID Number: " + super.getDescription() + tailIDNumber);
    }
}