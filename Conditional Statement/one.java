// 1. Write a C program to accept two integers and check whether they are equal or not. 
// Test Data : 15 15
// Expected Output :
// Number1 and Number2 are equal


import java.util.Scanner;
public class one {
    public static void main(String args[]) {
        int num1,num2;
        
        
        System.out.println("Enter first number: ");
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        System.out.println("Enter second number: ");
        num2=sc.nextInt();
        if(num1==num2)
        System.out.println("Numbers are equal");
        else
        System.out.println("Not Equal");
        sc.close();

    }
}
