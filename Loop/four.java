

// 4. Write a program in C to read 10 numbers from keyboard and find their sum and average.  
// Test Data :
// Input the 10 numbers :
// Number-1 :2
// ...
// Number-10 :2
// Expected Output :
// The sum of 10 no is : 55
// The Average is : 5.500000

import java.util.Scanner;
public class four {
    public static void main(String args[]) {
        int n,sum=0,j;
        float avg;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no of terms:");
        n=sc.nextInt();

        System.out.println("Enter n numbers:");
        for(int i=1;i<=n;i++)
        {
            j=sc.nextInt();   
            sum=sum+j;
        }
        System.out.println("Sum is:"+sum);
        
        avg=sum/n;
        System.out.println("Average is:"+avg);
        sc.close();
    }    
}
