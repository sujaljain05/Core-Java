abstract class Programming
{
   public abstract void Developer();
}
class HTML extends Programming
{
    @Override
    public void Developer()
    {
        System.out.println("HTML Developer is: Tim Berners Lee");
    }
}
class Java extends Programming
{
    @Override
    public void Developer()
    {
        System.out.println("Java Developer is: James Gosling");
    }
}

public class Method {
    public static void main(String[] args) {
        HTML h=new HTML();
        Java j=new Java();
        h.Developer();
        j.Developer();
        Programming P=new HTML();
        P.Developer();
        Programming P1=new Java();
        P1.Developer();
    }
}
