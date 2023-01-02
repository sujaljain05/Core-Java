class Final
{
    void mNumber()
    {
        System.out.println("8529193838");
    }
    final void mPin()                // can't access final methodo99
    {
        System.out.println("721");
    }
}
class Thief extends Final
{
    @Override
    void mNumber()
    {
        System.out.println("8529193838");
    }
    @Override     
    void mPin()               // can't override because this method is final
    {
        System.out.println("721");
    }
}


class FinalMethod
{
    public static void main(String[] args) {
        
        Thief t=new Thief();
        t.mNumber();
        t.mPin();
    }
}