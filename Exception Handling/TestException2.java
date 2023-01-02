

public class TestException2 {
    public static void main(String[] args) 
    {
        System.out.println("Before dividing");

        try
        {
            
            String s=null;
            System.out.println(s);
            System.out.println(s.length());
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(NullPointerException e)
        {
            System.out.println("Please enter value in string");
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
        finally
        {
            System.out.println("I will always run");
        }
        System.out.println("Hello");
        System.out.println("Hello");
    }
}
