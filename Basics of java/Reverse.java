import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,rem;
        System.out.println("Enter a number to reverse");
        n=sc.nextInt();

        System.out.println("Reverse order is: ");
        while(n>0)
        {
            rem=n%10;
            System.out.print(rem);
            n/=10;
        }
        sc.close();
    }
}
