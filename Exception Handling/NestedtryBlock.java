public class NestedtryBlock {
    public static void main(String[] args) {
        
        try
        {
            try
            {
                int a[]={1,2,3,4};
                System.out.println(a[4]);
            }
            catch(ArrayIndexOutOfBoundsException Ae)
            {
                System.out.println(Ae);
            }
            
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }

        System.out.println("Learn Coding");
    }
}
