import java.util.Arrays;
import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        
        System.out.println("Enter first array elements:");
        for (int i = 0; i < a.length; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Second array elements:");
        for (int i = 0; i < b.length; i++)
        {
            b[i]=sc.nextInt();
        }
        boolean bool=Arrays.equals(a, b);
        System.out.println("Both Arrays Are Equals? "+bool);

        sc.close();
    }
}
