class A
{
    A show()
    {
        System.out.println("Learn Coding");
        return this;                                         // this --> new A();
    }
}
class B extends A
{
    @Override
    B show()
    {
        super.show();
        System.out.println("Please Like");
        return this;                                    // this --> new B();
    }
}

public class CovarientReturntype
{
    public static void main(String[] args) {
        
        B b=new B();
        b.show();

    }
}