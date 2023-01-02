interface client
{
    void Webdesign();           // public+abstract
    void Webdevelopment();      // public+abstract
}
abstract class RajTech implements client
{
    @Override
    public void Webdesign()
    {
        System.out.println("Green, top menu, three dot button");
    }
}
class Rahultech extends RajTech
{
    @Override
    public void Webdevelopment()
    {
        System.out.println("HTML, CSS, JavaScript");
    }
}
public class InterfaceMethod {
    public static void main(String[] args) 
    {
        Rahultech R=new Rahultech();
        R.Webdesign();
        R.Webdevelopment();
    }
}
