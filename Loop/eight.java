

// 8. Write a program in C to display the n terms of odd natural number and their sum .  
// Test Data
// Input number of terms : 10
// Expected Output :
// The odd numbers are :1 3 5 7 9 11 13 15 17 19
// The Sum of odd Natural Number upto 10 terms : 100
// Click me to see the solution

import java.util.Scanner;
public class eight {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Input number of terms: ");
        int n=sc.nextInt();

        System.out.print("The odd natural numbers are: ");
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
                System.out.print(i+" ");
            }
        
        }
        System.out.println();
        System.out.println("The sum of odd Natural number upto "+n+" terms: "+sum);
        sc.close();
    }
}
