                                            //Instance Block in java

class A
{
    int a,b;
    A()
    {
        a=10; b=20;
        System.out.println(a+" "+b);
    }
    {                                       // Instance Block
        a=50;b=100;
        System.out.println(a+" "+b);             
    }
}

public class InstanceBlock {
    public static void main(String[] args) {
        
        A ref=new A();
    }
}
System.out.println("");

// Note:- In java Instance block will execute befor the constructor.
// But if any method is static then we can call that method when we want. 
