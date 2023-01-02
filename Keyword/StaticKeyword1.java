class Test1
{
    Test1()
    {
        System.out.println("I am a constructor");
    }
    static
    {
        System.out.println("Static Block");
    }

    {
        System.out.println("Normal Block");
    }
}

public class StaticKeyword1 {
    public static void main(String[] args) {
        
        System.out.println("In main");
        Test1 t=new Test1();

    }
}

// Note:- First static block then instance block and then constructor will call.
// Static block called by default when making object.