                            // Static vs Non-Staic Method 

public class Static_Nonstatic 
{
    int a=10;
    static int b=20;

    public static void main(String[] args) {
        
        Static_Nonstatic ref=new Static_Nonstatic();
        ref.disp();
        Static_Nonstatic.show();
    }
    static void show()                      // Static Method can be directly called my class name.
    {
        System.out.println(b);                // Can't access the non-static variable
    }
    void disp()                             // Non-Static Method can be called by creating a object of class.
    {   
        System.out.println(a+" "+b);       // can access both variable
        
    }
}
