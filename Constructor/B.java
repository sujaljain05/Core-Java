                        // Static Block
class B
{


    public static void main(String[] args) {
        
        B ref=new B();
    }
    B()
    {
        System.out.println("Construcor");
    }
    {
        System.out.println("Instance Block");
    }
    static
    {
        System.out.println("Staic Block");
    }
}


// Note:- Static block will execute first then Instance Block and then Constructor will execute.
