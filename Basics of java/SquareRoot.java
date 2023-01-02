import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        double sqr=Math.sqrt(n);
        System.out.println(sqr);

        sc.close();

    }
}
