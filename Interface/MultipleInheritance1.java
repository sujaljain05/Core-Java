                    // Multiple Inheritance using Interface

interface A
{
    void show();
}
interface B
{
    void Disp();
}
public class MultipleInheritance1 implements A,B {
    public void show()
    {
        System.out.println("Interface A");
    }
   public void Disp()
    {
        System.out.println("Interface B");
    }
    public static void main(String[] args) {
        
        MultipleInheritance1 M=new MultipleInheritance1();
        M.show();
        M.Disp();
    }
}
