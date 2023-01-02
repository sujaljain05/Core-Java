import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int temp;
        System.out.println("Enter array elements:");
        for (int i = 0; i < a.length; i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = i+1; j < a.length; j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }   
            }
        }
        System.out.println("Sorted Array is:");
        for (int i = 0; i < a.length; i++) 
        {
            System.out.println(a[i]+" ");
        }
        sc.close();
    }
}
