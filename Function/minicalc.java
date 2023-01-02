import java.util.Scanner;

class calculator
{
    Scanner sc=new Scanner(System.in);

    void add()      // no argument no return type
    {
        int a,b,c;
        System.out.println("Enter first number:");
        a=sc.nextInt();
        System.out.println("Enter second number:");
        b=sc.nextInt();
        c=a+b;
        System.out.println("The sum is:"+c);
    }

    void substract(int a,int b)      // with argument no return
    {
        int c;
        c=a-b;
        System.out.println("Substraction is: "+c);
    }         
    float divide()     // no argument with return type
    {
        float a,b,c;
        System.out.println("Enter 1st number:");
        a=sc.nextFloat();
        System.out.println("Enter 2nd number:");
        b=sc.nextFloat();
        c=a/b;

        return c;

    }
    float multiply(float a,float b)
    {
        return a*b;
    }

}


public class minicalc {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // int a,b;
        calculator calc=new calculator();
        // System.out.println("Enter first number:");
        // a=sc.nextInt();
        // System.out.println("Enter second number:");
        // b=sc.nextInt();
        float a,b;
        System.out.println("Enter first number:");
        a=sc.nextFloat();
        System.out.println("Enter second number:");
        b=sc.nextFloat();

        


      // calc.substract(a,b);
        
        // float result= calc.divide();
        float result=calc.multiply(a,b);
        System.out.println("The multiply is: "+result);
        sc.close();
    }    


}
