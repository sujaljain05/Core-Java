interface Vehicle
{
    int num=56;//public static final num=56;
    public static final double speed=150;//public static final num=56;
    void honk();//public abstract void honk();
    public abstract void drive();
}

class Bike implements Vehicle
{

    @Override
    public void honk() {
    System.out.println("honking lightly");        
    }

    @Override
    public void drive() {
    System.out.println("slowly");        
    }

}

public class RunVehicle2 {

    public static void main(String[] args) {
        
        //class extends class
        //class implements interface
        //interface extends interface

        Bike b=new Bike();
        b.drive();
        b.honk();
    }
}