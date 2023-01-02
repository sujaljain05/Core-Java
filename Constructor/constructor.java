                                // Constructor in Java

class A
{
    int a;
    String name;
    
    // A()
    // {
    //     a=0;                   
    //     name=null;
    // }
    void show()
    {
        System.out.println(a+" "+name);
    }
}
class constructor
{
    public static void main(String[] args) {
        
        A ref=new A();
        ref.show();
    }
}

//Note: By default value of any integer will be 0 and string value will be null.