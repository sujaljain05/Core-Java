final class Test                     // can't be inherited in sub class
{
    void mNumber()
    {
        System.out.println("8529193838");
    }
    void mPin()
    {
        System.out.println("3838");
    }
}
class Thief extends Test
{
    void mNumber()
    {
        System.out.println("8529193838");
    }
    void mPin()
    {
        System.out.println("3838");
    }
}

class FinalClass
{
    public static void main(String[] args) {
        Thief t=new Thief();
        t.mNumber();
        t.mPin();
    }
}