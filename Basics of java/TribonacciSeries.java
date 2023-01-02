// Tribonacci Series : -   0 1 2 3 6 11 20


import java.util.Scanner;

public class TribonacciSeries {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c=2,d,term;
        System.out.print("Enter the terms:");
        term=sc.nextInt();

        System.out.print("Tribonacci Series is:");
        for(int i=0;i<term;i++)
        {
            System.out.print(a+" ");
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
        sc.close();
    }
}
