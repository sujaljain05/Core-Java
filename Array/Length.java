import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements in array:");

        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array Elements:");
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
        
        System.out.println("\nArray length is: "+a.length);
        sc.close();
    }
}
