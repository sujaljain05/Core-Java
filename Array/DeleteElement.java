import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int size,loc,i;
        System.out.println("Enter array size:");
        size=sc.nextInt();

        int a[]=new int[size];
        System.out.print("Enter Array Elements:");
        for (i = 0; i < a.length; i++) 
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Array Location which element you want to delete:");
        loc=sc.nextInt();

        for(i=loc;i<size-1;i++)
        {
            a[i]=a[i+1];
        }
        size--;
        System.out.println("Array Elements after deletion");
        for(i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
