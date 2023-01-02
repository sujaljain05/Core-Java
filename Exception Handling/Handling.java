public class Handling {
    public static void main(String[] args) {
        
        try
        {
            System.out.println("Learn Coding");
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
            System.out.println("Like share");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't divide by zero");
        }
        finally            // it will run in any case
        {
            System.out.println("Subscribe");
        }
        System.out.println("Main method ended");
    }
}
