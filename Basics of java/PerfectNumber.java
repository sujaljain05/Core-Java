import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        n=sc.nextInt();

        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(n==sum)
        {
            System.out.println("PERFECT NUMBER");
        }
        else
        {
            System.out.println("NOT PERFECT NUMBER");
        }
        sc.close();
    }
}
