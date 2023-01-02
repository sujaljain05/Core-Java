class PrintNumber implements Runnable
{
    int num;
    PrintNumber(int num)
    {
        this.num=num;
    }

    public void run() 
    {
        System.out.println(num+" by "+Thread.currentThread().getName());
    }
}

public class Thread3 {
    public static void main(String[] args) 
    {
        Thread t;
        for (int i = 1; i<=100; i++) 
        {
            t=new Thread(new PrintNumber(i));
            t.start();
        }
    }
}
