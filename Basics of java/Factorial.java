import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,fact=1;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        int original=n;
        while (n>0) {
            fact=fact*n;
            n--;
        }
        System.out.println("Factorial of "+original+" is: "+fact);

        sc.close();
    }
}
