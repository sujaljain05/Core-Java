import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month:");
        int m=sc.nextInt();

        if(m==1)
        {
            System.out.println("JAN = 31days");
        }
        else if(m==2)
        {
            System.out.println("FEB = 28 days");
        }
        else if(m==3)
        {
            System.out.println("FEB = 28 days");
        }
        else if(m==4)
        {
            System.out.println("MARCH = 30 days");
        }
        else if(m==5)
        {
            System.out.println("MAY = 31 days");
        }
        else if(m==6)
        {
            System.out.println("JUNE = 30 days");
        }
        else if(m==7)
        {
            System.out.println("JULY = 31 days");
        }
        else if(m==8)
        {
            System.out.println("AUG = 31 days");
        }
        else if(m==9)
        {
            System.out.println("SEP = 30 days");
        }
        else if(m==10)
        {
            System.out.println("OCT = 31 days");
        }
        else if(m==11)
        {
            System.out.println("NOV = 30 days");
        }
        else if(m==12)
        {
            System.out.println("DEC = 31 days");
        }
        else
        {
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
