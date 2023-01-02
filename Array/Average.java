import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int sum=0; float avg;
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < a.length; i++) 
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array Elements are:");
        for (int i = 0; i < a.length; i++) 
        {
            System.out.println(a[i]+" ");
        }

        for (int i = 0; i < a.length; i++) 
        {
            sum=sum+a[i];
        }
        avg=sum/5;
        System.out.println("Sum of Array Elements is: "+sum);
        System.out.println("Average of array elements is:"+avg);
        sc.close();
    }
}
