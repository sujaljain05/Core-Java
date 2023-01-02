public class NestedFinally {
    public static void main(String[] args) {
        
        try
        {
            String s="sujal";
            System.out.println(s.toUpperCase());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                System.out.println(10/0);
            }
            catch(ArithmeticException Ae
            {
                System.out.println(Ae);
            }
            finally
            {
                System.out.println("This will be execute in any case");
            }
        }
        System.out.println("Main method ended");
    }
}
