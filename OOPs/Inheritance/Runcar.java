class Car
{
    int wheels=4;
    String model="Bugati";
    String color="Red";
    // Engine E=new Engine();      // HAS A 

    void showCarDetails()
    {
        Engine E=new Engine();  // Uses-A
        E.showEngineProperty();
        System.out.println("Car has "+wheels+" wheels and model is "+model);
        System.out.println("Car color is: "+color);
    }
}
    // A car HAS A Engine.
public class Runcar
{
    public static void main(String[] args) {

        Car c=new Car();
        c.showCarDetails();

    }
}
