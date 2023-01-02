import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n1,n2;
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        n1=sc.nextInt();
        n2=sc.nextInt();

        System.out.println("Prime Numbers are:");
        for(i=n1;i<=n2;i++)
        {
            for(j=2;j<=i;j++)
            {
                if(i%j==0)
                break;
            }
        if(i==j)
        {
            System.out.print(j+" ");
        }
        }
        
        
    }
}
