import java.util.Scanner;

public class NewArray {
    public static void main(String[] args) {
        
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size:");
        size=sc.nextInt();

        int a[]=new int[size];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < a.length; i++) 
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");

        for (int i : a) 
        {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
