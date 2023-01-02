public class ExceptionPropogation {
    public static void main(String[] args) 
    {
        try
        {
            m1();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception Handled");
        }
    
    }
    public static void m1()
    {
        m2();
    }
    public static void m2()
    {
        System.out.println(10/0);
    }
}
