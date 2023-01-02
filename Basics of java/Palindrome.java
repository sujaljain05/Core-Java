import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        int n,rem,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        n=sc.nextInt();
        int original=n;
        while(n>0)               // 121
        {
            rem=n%10;
            sum=sum*10+rem;     // (0*10)+1  (1*10)+2   (12*10)+1
            n/=10;
        }
        if(original==sum)
        {
            System.out.println(sum+" is a Palindrome number");
        }
        else
        {
            System.out.println("Not Palindrome number");
        }
        sc.close();
    }
}
