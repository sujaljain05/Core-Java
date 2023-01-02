import java.util.Scanner;

public class two {
    public static int calculateSum(int n)
    {
        int sum=0;   
        for(int i=1;i<=n;i++)
        {
            
            if(i%2!=0)
            {
                sum=sum+i;
            }
            
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter upto number:");
        int n=sc.nextInt();

        System.out.println("Sum of odd numbers is: "+calculateSum(n));
        sc.close();
    }
}
