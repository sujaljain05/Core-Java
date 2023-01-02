                    // Extending Interface
interface Gill
{
    void add();
}
interface Raj extends Gill
{
    void sub();
}
class Ankit implements Raj
{
    @Override
    public void add()
    {
        int a=10,b=20,c;
        c=a+b;
        System.out.println("Addition is:"+c);
    }
    @Override
    public void sub()
    {
        int a=20,b=10,c;
        c=a-b;
        System.out.println("Substraction is:"+c);
    }
}
public class ExtendingInterface 
{
    public static void main(String[] args) {
        
        Raj A=new Ankit();
        A.add();
        
    }
}
