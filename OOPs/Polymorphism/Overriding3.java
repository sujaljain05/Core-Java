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
    // void eat()
    // {
    //     System.out.println("Animal is eating");
    // }
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
class Overriding3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter animal name :");
        String animal=sc.next();

        // Animal ani=new Animal();
        // ani.eat();
        // Animal a=new Lion();
        // a.eat();//lion property eat
        // a.showAni();
        // a.showLion();

        Animal a2;//reference variable of Animal
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