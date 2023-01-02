import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements:");

        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array Elements are:");

        for(int i=4;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
