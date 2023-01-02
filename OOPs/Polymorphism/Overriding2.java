import java.util.Scanner;

class Animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
    void showAni()
    {
        System.out.println("i am a animal");
    }
}
class Lion extends Animal
{
    @Override
    void eat()
    {
        System.out.println("i am carnivores");
    }
    void showLion()
    {
        System.out.println("hii i am lion");
    }
}
class Dog extends Animal
{
    @Override
    void eat()
    {
        System.out.println("i am omnivores");
    }
    void showDog()
    {
        System.out.println("hii i am a dog");
    }
}
class Overriding2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter animal name :");
        String animal=sc.next();

        // Animal a=new Lion();
        // a.eat();//lion property eat
        Animal a2;
        if (animal.equals("dog")) 
        {
            a2=new Dog();
        }
        else if(animal.equals("lion"))
        {
            a2=new Lion();
        }
        else 
        {
            a2=new Animal();
        }

        a2.eat();
        sc.close();
    }
}