// 2. Write a C program to check whether a given number is even or odd. 
// Test Data : 15
// Expected Output :
// 15 is an odd integer


import java.util.Scanner;
public class two {
    public static void main(String args[]) {
        
        int num;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();

        if(num%2==0)
        System.out.println(+num+" is an even number");
        else
        System.out.println(+num+" is an odd number");

        sc.close();
    }
}
