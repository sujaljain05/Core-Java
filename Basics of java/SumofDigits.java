import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n,sum=0,rem;
        System.out.println("Enter the number:");
        n=sc.nextInt();

        while(n>0)
        {
            rem=n%10;
            sum+=rem;
            n/=10;
        }
        System.out.println("Sum of digits is:"+sum);
        sc.close();
    }
}
