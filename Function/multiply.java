import java.util.Scanner;

public class multiply {
    
    public static int calculateMultiply(int a,int b)
    {
        return a*b;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();

        System.out.println("The multiplication is: "+calculateMultiply(a, b));

        sc.close();
    }
}
