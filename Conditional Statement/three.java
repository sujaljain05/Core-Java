

// // 3. Write a C program to check whether a given number is positive , negative or zero. 
// // Test Data : 15
// // Expected Output :
// // 15 is a positive number

import java.util.Scanner;
public class three {
    public static void main(String args[]) {
        int num;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
        
        if(num>0)
        System.out.println("Positive number");
        else if(num<0)
        System.out.println("Negative number");
        else
        System.out.println("This is zero");

        sc.close();
    }
}

