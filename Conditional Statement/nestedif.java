import java.util.Scanner;

public class nestedif {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks=sc.nextInt();

        if(marks>=90 && marks<=100)
        {
        System.out.println("Got Admission in D.U.");
        System.out.println("Enter your marks in detail:");
            if(marks>=95)
            {
                System.out.println("Eligible for Science");
            }
            else
            {
                System.out.println("Eligible for commerce");
            }
        }    
        else if(marks>=80 && marks<90)
        {
            System.out.println("Got Admission in IPU");
            System.out.println("Enter your marks in detail:");

            if(marks>85)
            {
                System.out.println("Eligible for Science");
            }
            else
            {
                System.out.println("Eligible for commerce");
            }
        }
        else
        {
            System.out.println("Not eligible for Admission");
        }    
        
        
        sc.close();
    }

    }
