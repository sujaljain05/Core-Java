public class ThrowsDemo {
    public static void main(String[] args) throws InterruptedException  // JVM will handle this
    {
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(i);
            Thread.sleep(1000);        
        }
    }
}