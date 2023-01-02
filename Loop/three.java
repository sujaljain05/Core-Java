// 3. Write a program in C to display n terms of natural number and their sum. 
// Test Data : 7
// Expected Output :
// The first 7 natural number is :
// 1 2 3 4 5 6 7
// The Sum of Natural Number upto 7 terms : 28

import java.util.Scanner;
class three{
    public static void main(String args[]) {
        int sum=0,n;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no. of terms:");
        n=sc.nextInt();
        System.out.println("The natural numbers are:");
        for(int i=1;i<=n;i++)
        {
            System.out.print(" "+i);
            sum=sum+i;
        }
        System.out.println("\n");
        System.out.println("Their sum is:"+sum);
        
        sc.close();
    }
}