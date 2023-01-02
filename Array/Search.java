import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        
        int a[]=new int[5];
        int search;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Elements:");

        for (int i = 0; i < a.length; i++) 
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array Elements are:");

        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("\nEnter search element");
        search=sc.nextInt();
        for (int i = 0; i < a.length; i++) 
        {
            if(search==a[i])
            {

                System.out.println("Element found at "+i);
            }
        }
        sc.close();
    }
    }