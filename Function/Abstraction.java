abstract class Vehicle
{
    public abstract void drive();
    void show()
    {
        System.out.println("hii  i am a type of Vehicle");
    }
}
class Bike extends Vehicle
{
    void accelerate()
    {
        System.out.println("accelerate the bike");
    }
    @Override
    public void drive() 
    {
        System.out.println("driving the bike");        
    }
}
public class Abstraction {
    public static void main(String[] args) {

        Bike b=new Bike();
        b.accelerate();
        b.drive();
        b.show();

        // Vehicle v=new Vehicle();

        Vehicle v=new Bike();
        v.drive();
        v.show();
        // v.accelerate();

        // Abstract classes -> 0-100% abstraction 
        // Interface -> 100% abstraction


    }
}