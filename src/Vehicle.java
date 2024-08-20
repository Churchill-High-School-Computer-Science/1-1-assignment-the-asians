public class Vehicle{

    private double Price;
    private String Color;
    private String Make;
    private String Model;

    public Vehicle(double Price, String Color, String Make, String Model){
        this.Price = Price;
        this.Color = Color;
        this.Make = Make;
        this.Model = Model;
    }

    public double getPrice(){
        return Price;
    }

    public String getDescription(){
        return Color + " "+ Make +" "+ Model;
    }
}