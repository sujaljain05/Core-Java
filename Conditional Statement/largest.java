// 8. Write a C program to find the largest of three numbers. 
// Test Data : 12 25 52
// Expected Output :
// 1st Number = 12,        2nd Number = 25,        3rd Number = 52
// The 3rd Number is the greatest among three

import java.util.Scanner;

public class largest {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        System.out.println("Enter third number: ");
        int c=sc.nextInt();

        if(a>b && a>c)
        System.out.println(+a+" is largest number");
        else if(b>c && b>a)
        System.out.println(+b+" is largest number");
        else
        System.out.println(+c+" is largest number");

        sc.close();
    }
}
