                    // Compile time Polymorphism  
                    // Method Overloading

class A
{
    void add()
    {
        int a=20,b=10;
        int c=a+b;
        System.out.println(c);
    }
    void add(int x,int y)
    {
        int c=x+y;
        System.out.println(c);
    }
    void add(int x,double y)
    {
        double c;
        c=x+y;
        System.out.println(c);
    }
}

class StaticPolymorphism     // Compile Time Polymorphism
{
    public static void main(String[] args) {
        
        A a=new A();
        a.add();
        a.add(100,200);
        a.add(30, 20.5);
    }
}