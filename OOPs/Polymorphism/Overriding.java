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

class Overriding
{
    public static void main(String args[])
    {
        // Animal a=new Animal();
        // a.eat();
        // Lion l=new Lion();
        // l.eat();
        // l.showAni();
        // l.showLion();

        Animal ani=new Lion();
        ani.eat();//overridden eat method (which is redefined by child)
        ani.showAni();//parent class property
        // ani.showLion();  

    }
}