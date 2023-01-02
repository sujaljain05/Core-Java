

class ExceptionHandling
{
    public static void main(String[] args) {
        
        System.out.println("Main method Started");

        int a=10,b=0,c;

        try{
            c=a/b;       // c=10/0
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't Divide by zero");
        }
        System.out.println("Main Method Ended");
    }
}