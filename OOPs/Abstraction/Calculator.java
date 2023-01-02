import java.util.Scanner;

abstract class CalculatorOperation
{
    abstract void add(int a,int b);
    abstract void sub(int a,int b);
    abstract void multi(int a,int b);
    abstract void div(int a,int b);
}
public class Calculator extends CalculatorOperation
{   
    void add(int a, int b)
    {
        System.out.println("Addition is:"+(a+b));
    }
    void sub(int a, int b)
    {
        System.out.println("Substraction is:"+(a-b));
    }
    void multi(int a, int b)
    {
        System.out.println("Multiplication is:"+(a*b));
    }
    void div(int a, int b)
    {
        System.out.println("Division is:"+(a/b));
    }
    void input()
    {
        System.out.println("Invalid input");
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Enter the no. between 1 to 5 for perform operation");
        int n=sc.nextInt();
        CalculatorOperation c=new Calculator();

        switch (n) {
            case 1: c.add(a,b);
                      break;
            case 2: c.sub(a,b);
                      break;
            case 3: c.multi(a,b);         
                      break;
            case 4: c.div(a,b);
                      break;
             default:
                break;
            
        }
        sc.close();
    }
}
