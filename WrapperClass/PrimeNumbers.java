import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        
        ArrayList<Integer> A=new ArrayList<>();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the minimum element");
        int min=sc.nextInt();
        System.out.println("Enter the maximum element");
        int max=sc.nextInt();


        for (int i = min; i<=max; i++) 
        {
            int flag=0;
            for(int j=2;j<=i-1;j++)
            {
                if(i%j==0)
                {   
                    flag++;
                }
            }   
            if(flag==0)
            {
                A.add(i);
            }
        }
        sc.close();
    }
}
