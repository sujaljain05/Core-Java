import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        
        int size,loc,item;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        size=sc.nextInt();
        int a[]=new int[size+1];
        System.out.println("Enter elements in array:");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the location:");
        loc=sc.nextInt();
        System.out.println("Enter the item to insert in array");
        item=sc.nextInt();

        for(int i=size;i>loc;i--)
        {
            a[i]=a[i-1];
        }
        a[loc]=item;
        size++;
        System.out.println("New Array is:");
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }   
}
