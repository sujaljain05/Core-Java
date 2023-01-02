class Great extends Thread
{
    public void run()
    {
        System.out.println("Good Morning Everyone");
    }
}

class Threads
{
    public static void main(String[] args) 
    {
        System.out.println("Hello I am main");

        Great g=new Great();
        // Thread t=new Thread(g);
        // t.start();       
        g.start();       // Second Way
        System.out.println("Bye by main");
    }
}