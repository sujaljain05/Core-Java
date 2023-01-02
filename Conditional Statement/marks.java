// 12. Write a C program to read roll no and marks of three subjects and calculate the total, percentage and division. 
// Test Data :
// Input the Roll Number of the student :784
// Input the marks of Physics, Chemistry and Computer Application : 70 80 90
// Expected Output :
// Roll No : 784
// Marks in Physics : 70
// Marks in Chemistry : 80
// Marks in Computer Application : 90
// Total Marks = 240
// Percentage = 80.00
// Division = First

import java.util.Scanner;
public class marks {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);

        
        System.out.println("Enter roll no:");
        int rollno=sc.nextInt();
        System.out.println("Input the marks of Physics,Chemistry and Computer:");
        int marks1=sc.nextInt();
        int marks2=sc.nextInt();
        int marks3=sc.nextInt();

        System.out.println("Roll no.-"+rollno);
        System.out.println("Marks in Physics"+marks1);
        System.out.println("Marks in Chemistry"+marks2);
        System.out.println("Marks in Computer Application"+marks3);

        int total=marks1+marks2+marks3;
        System.out.println("Total Marks="+total);
        System.out.println("Percentage is:" +(+total/3));
        System.out.println("Division: First");

        sc.close();
    }
}
