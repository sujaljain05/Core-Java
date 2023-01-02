class PrintNum implements Runnable
{
    public void run()
    {
        for (int i = 1; i <= 50; i++) 
        {
            System.out.println(i+" by "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Terminated unexpectedly by Sujal");
                e.printStackTrace();
            }
        }
    }
}

public class Threads2 {
    public static void main(String[] args) 
    {
        Thread t=new Thread(new PrintNum());    
        t.start();    

        for (int i = 1; i <= 50; i++) 
        {
            System.out.println(i+" by "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Terminated unexpectedly by Sujal");
                e.printStackTrace();
            }
        }
    }
}
