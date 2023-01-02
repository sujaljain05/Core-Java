class Greet implements Runnable
{
    public void run()
    {
        System.out.println("Good Morning Everyone : by "+Thread.currentThread().getName());
    }
}
public class Threads1 {
    public static void main(String[] args) 
    {
        // Greet g=new Greet();
        // g.run();    // don't use it

        // Thread t=new Thread(g);
        // t.start();

        // Thread t=new Thread(new Greet());    // in two line
        // t.start();

        // new Thread(new Greet()).start();      // in one line
    }
}
