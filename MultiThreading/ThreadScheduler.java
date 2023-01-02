                        // Thread Scheduler

class A extends ThreadScheduler
{
    public void run()
    {
        String n=Thread.currentThread().getName();
        for(int i=0;i<=2;i++)
        {
            System.out.println(n);
        }
    }

    public void setName(String string) {
    }
}

public class ThreadScheduler {
    public static void main(String[] args) {
        
        A t1=new A();
        A t2=new A();
        A t3=new A();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();


    }
}
