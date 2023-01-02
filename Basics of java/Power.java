import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Enter power to calculate:");
        int p=sc.nextInt();
        int result=1;
        for(int i=1;i<=p;i++)
        {
            result=n*result;
        }
        System.out.println("Power of "+n+" is: "+result);
        sc.close();
    }
}
