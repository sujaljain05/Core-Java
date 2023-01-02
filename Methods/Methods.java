import java.util.Scanner;

public class Methods {
    int n1,n2;
    int add,mul,sub,div,rem;
    
    public static void main(String[] args) {

        Methods m=new Methods();
        m.input();
        m.process();
        m.output();

    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        n1=sc.nextInt();
        n2=sc.nextInt();

        sc.close();
    }
    void process()
    {
        add=n1+n2;
        sub=n1-n2;
        mul=n1*n2;
        div=n1/n2;
        rem=n1%n2;
    }
    void output()
    {
        System.out.println("Addition is: "+add);
        System.out.println("Substraction is: "+sub);
        System.out.println("Multiplication is: "+mul);
        System.out.println("Division is: "+div);
        System.out.println("Remainder is: "+rem);
    }
}
