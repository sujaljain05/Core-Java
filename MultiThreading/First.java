                // By extending Thread class

class A extends Thread
{

    @Override
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
        {
            System.out.println("Sujal Jain");

            Thread.sleep(1000);
        }
        }
        catch(InterruptedException e)
        {
            System.out.println("Exception Handled");
        }
    }
}
class First
{
    public static void main(String[] args) throws InterruptedException
    {
        
        A r=new A();
        r.start();

        for(int i=1;i<=5;i++)
        {
            System.out.println("Shanu Jain");
            Thread.sleep(1000);
        }
    }
}