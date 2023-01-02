class A
{
    int a; double b; String s;
    private A()
    {
        a=10;  b=30.50; s="Sujal";
        System.out.println(a+" "+b+" "+s);
    }

    public static void main(String[] args) {
        
        A ref=new A();
    }
}


//Note:- We cannot access the private constructor in another class. We can only access in the same class.