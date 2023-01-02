import java.util.Scanner;

public class name {
    public static void main(String args[]) {
        
        String Name;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name:");

        // Name=sc.nextLine();       // for print sentence
        Name=sc.next();             // for only one word

        System.out.println("The name is : "+Name);
        sc.close();

    }
}
