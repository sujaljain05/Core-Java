class M
{
    public static void add()                     // Static Method
    {
        int a=10,b=20;
        System.out.println("Sum is"+(a+b));
    }
    public static void main(String[] args) {
        
        M m=new M();
        m.Display();
        M.add();
    }
    void Display()                              // Non-Static Method
    {
        System.out.println("Hello World");
    }
}