import java.util.Arrays;
import java.util.Scanner;
public class Copy {
    public static void main(String[] args) {
        
        int a[]=new int[5];
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value in first array");

        for (int i = 0; i < a.length; i++) 
        {
            a[i]=sc.nextInt();   
        }
        int a2[]=Arrays.copyOf(a, 5);
        System.out.println("Elements in Array2 are:");

        for (int i = 0; i < a2.length; i++)
        {
            System.out.println(a2[i]+" ");
        }
        sc.close();
    }
}
