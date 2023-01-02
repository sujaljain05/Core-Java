public class trycatchVsThrows 
{
     public static void Wait() throws InterruptedException
    {
        
        for (int i = 0; i <=5; i++) 
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    // public static void main(String[] args) throws Exception
    // {
    //     Wait();
    //     System.out.println(10/0);
    //     System.out.println("Main Method ended");
    // }

    public static void main(String[] args) {
        
        try
        {
            Wait();
            System.out.println(10/0);
        }
        catch(Exception e)
        {
            System.out.println("Exception Handled");
        }
        System.out.println("Main method ended");
    }
}


//Note:- Best approach to handle exception is try catch mehtod.