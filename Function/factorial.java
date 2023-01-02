import java.util.Scanner;

public class factorial {
    
    public static void printFactorial(int n)
    {
        int fact=1;

        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        for(int i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println(fact);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();

        printFactorial(n);

        sc.close();
    }
}
