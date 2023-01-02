
class A
{
    int x,y;

    A(int a,int b)            // Parameterized Constructor
    {
        x=a;  y=b;
    }
    A(int a,String c)
    {
        System.out.println(a+" "+c);
    }
    void show()
    {
        System.out.println(x+" "+y);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        
        A ref=new A(100,200);
        ref.show();
        A r=new A(10, "Sujal");
        
    }
}
