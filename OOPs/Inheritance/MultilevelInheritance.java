class Mammal
{
    String bloodtype="warm";
    String reproduceMethod="Birth";
    void showMammalsProperty()
    {
        System.out.println("blood type :"+bloodtype);
        System.out.println(" the gives "+reproduceMethod);
    }
}
class Cat extends Mammal
{
    int legs=4;
    String type="Omnivores";
    void showCatProperty()
    {
        System.out.println("cats have "+legs+" legs");
        System.out.println("cats are "+type);
    }
}
class Leopard extends Cat
{
    float speed=150;

    void showLeopardProperty()
    {
        System.out.println("leopards can run at "+speed+" km/h");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {
        
        Leopard l=new Leopard();
        l.showMammalsProperty();
        l.showCatProperty();
        l.showLeopardProperty();
    }
}