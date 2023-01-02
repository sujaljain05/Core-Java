abstract class Vehicle
{
    String model;
    void honk()
    {
        System.out.println("I will honk !");
    }
    abstract void drive();
}
class Bike extends Vehicle
{
    void speed()
    {
        System.out.println("Top speed is 150km/h");
    }
    @Override
    void drive() 
    {
        model="Kawasaki ninja";
        System.out.println("i am driving a "+model+" bike");        
    }
}

class RunVehicle
{
    public static void main(String[] args) 
    {
        // Vehicle v=new Vehicle();
        // Bike b=new Bike();
        // b.drive();
        // b.honk();
        // b.speed();

        // Vehicle v=new Bike();
        // v.honk();
        // v.drive();
        // v.speed(); error

        //Anonymous class

        Vehicle v=new Vehicle() {
            void drive()
            {
                System.out.println("driving anything");
            }
        };

        v.honk();
        v.drive();

    }
}