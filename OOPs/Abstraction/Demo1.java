abstract class Animal{
    Animal()
    {
        System.out.println("All Animals");
    }
    public abstract void sound();
    
}
class Dog extends Animal
{
        Dog()
        {
            super();
        }
        public void sound()
        {
            System.out.println("Dog is Barking");
        }
}
class Lion extends Animal
{
    Lion()
    {
        super();
    }
    public void sound()
    {
        System.out.println("Lion is Roaring");
    }
}
public class Demo1 {
    public static void main(String[] args) 
    {
         Dog D=new Dog();
         Lion L=new Lion();
         D.sound();
         L.sound();
    } 
}
