import java.util.Scanner;

public class one {
    
    public static int printAverage(int a,int b,int c)
    {
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Enter third number:");
        int c=sc.nextInt();

        System.out.println("Average of three numbers is:"+printAverage(a, b, c));

        sc.close();
    }
}
