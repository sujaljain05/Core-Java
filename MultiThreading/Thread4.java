import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintNum implements Runnable
{
    int num;
    PrintNum(int num)
    {
        this.num=num;
    }
    public void run() 
    {
        System.out.println(num+" by "+Thread.currentThread().getName());    
    }
}
public class Thread4 {
    public static void main(String[] args) 
    {    
        // ExecutorService e=Executors.newCachedThreadPool();     
        // ExecutorService e=Executors.newFixedThreadPool(4);
        ExecutorService e=Executors.newSingleThreadExecutor();

        for (int i = 0; i < 50; i++) 
        {
            e.execute(new PrintNum(i));
        }
        e.shutdown();
    }
}
