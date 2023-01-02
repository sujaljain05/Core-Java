//inheritance : to inherit the ancestors property in child
// there are 5 type of inheritance
//1. single inheritance

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
class Cat extends Mammal  //here cat is child and mammal is parent
{
    //child class = subclass = derived class
    //Parent class = superclass = base class
    int legs=4;
    String type="Omnivores";
    void showCatProperty()
    {
        System.out.println("cats have "+legs+" legs");
        System.out.println("cats are "+type);
    }
}
class SingleInheritance
{
    public static void main(String[] args) 
    {
        Mammal m=new Mammal();
        m.showMammalsProperty();
        System.out.println("===================================");
        Cat c1=new Cat();
        c1.showMammalsProperty();
        c1.showCatProperty();
    }
}