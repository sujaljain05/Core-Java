class A
{
    int a; String b; boolean c;

    A()                               // default constructor
    {
        a=100; b="Sujal"; c=true;
    }
    void Disp()
    {
        System.out.println(a+" "+b+" "+c);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        
        A ref=new A();
        ref.Disp();
    }
    
}

// Note:- if we don't call the constructor then it will automatically call the constructor.
