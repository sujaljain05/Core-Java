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
class Dog extends Mammal
{
    String sound="Bark";
    String nature="Loyal";
    void showDogProperty()
    {
        System.out.println("Dogs "+sound);
        System.out.println("they are "+nature+" in nature");
    }
}
class Human extends Mammal
{
    int legs=2;
    String name="Deepak";
    void showHumanProperty()
    {
        System.out.println("Humans have "+legs+" legs");
        System.out.println("his name is "+name);
    }
}
public class HeiraicalInheritance
{
    public static void main(String[] args) 
    {
        System.out.println(" ========Human=================");
        Human h=new Human();
        h.showMammalsProperty();
        h.showHumanProperty();  
        System.out.println(" blood type of human is "+h.bloodtype);      

        System.out.println(" ========Dog=================");
        Dog d=new Dog();
        d.showMammalsProperty();
        d.showDogProperty();

        System.out.println(" ========Cat=================");
        Cat c=new Cat();
        c.showMammalsProperty();
        c.showCatProperty();

    }
}

   // IS-A Relationship (inheritance)
        // Human is a Mammal
        // Cat is a Mammal
        // Dog is a Mammal