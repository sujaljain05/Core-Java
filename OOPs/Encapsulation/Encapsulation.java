                        // Encapsulation
class A
{
    private int value;      // data hiding

    public void setValue(int x)   // data abstraction
    {
        value=x;         
    }
    public int getValue()
    {
        return value;
    }
}

class Encapsulation{
public static void main(String[] args) {
    
            A a=new A();
            a.setValue(100);
            System.out.println(a.getValue());
    
}
}