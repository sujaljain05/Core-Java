class A
{
    void add(int ... a)      // var-args method
    {
        int sum=0;
        for (int i : a) 
        {
            sum=sum+i;
        }
        System.out.println("Sum of Numbers:"+sum);
    }
}
public class VarArgsMethod {
    public static void main(String[] args) {
        
        A a=new A();
        a.add();
        a.add(10);
        a.add(10,20);
        a.add(10,20,30);
    }
}
