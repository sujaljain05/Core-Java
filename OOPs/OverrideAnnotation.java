class A
{
    void show()
    {
        System.out.println("Super class");
    }
}
class B extends A
{
    @Override            // this means method must be overridden.
    void show()
    {
        super.show();             // this will call parent class method
        System.out.println("Sub class");
    }
}
public class OverrideAnnotation {
    public static void main(String[] args) {
        
        B b=new B();
        b.show();
    }
}
