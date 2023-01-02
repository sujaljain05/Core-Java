public class MultiCatchBlock {
    public static void main(String[] args) {
        
        try
        {
            int a=10,b=2,c=a/b;
            System.out.println(c);

            int arr[]={1,2,3,4};
            System.out.println(arr[3]);

            String str="sujal";
            System.out.println(str.toUpperCase());

        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithemetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Exception");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Number Exception");
        }
        catch(Exception e)      // Exception e=new NullPointerException();
        {
            System.out.println("All type exception exception");
        }
        
    }
}
