public class NestedCatch {
    public static void main(String[] args) {
        
        try
        {
            System.out.println(10/0);
        }
        catch(Exception e)
        {
            System.out.println(e);
            try
            {
                String s=null;
                System.out.println(s.toLowerCase());
            
            }
            catch(NullPointerException n)
            {
                System.out.println("Null Value cannot be converted");
            }
            
        }
        System.out.println("Main method ended");
    }
}
