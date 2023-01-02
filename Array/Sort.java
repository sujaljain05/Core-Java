import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter Array Elements:");

        for (int i = 0; i < a.length; i++) 
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);

        System.out.println("Array elements in Ascending Order");
        for (int i = 0; i < a.length; i++) 
        {
            System.out.println(a[i]+" ");
        }
        sc.close();
    }
}
