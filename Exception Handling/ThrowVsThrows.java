class Test
{
    void div(int a,int b) throws ArithmeticException
    {
        if(b==0)
        {
            throw new ArithmeticException();
        }
        else
        {
            int c=a/b;
            System.out.println("Division is: "+c);
        }
    }
}
public class ThrowVsThrows {
    public static void main(String[] args) throws ArithmeticException
    {
        Test T=new Test();
        T.div(20, 0);

        // try
        // {
        // T.div(20,0);    
        // }8u
        // catch(Exception e)
        // {
        //     System.out.println("the value of b is zero");
        // }
    }
}
