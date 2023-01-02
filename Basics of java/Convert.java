import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character:");
        ch=sc.next().charAt(0);

        if(ch>='A' && ch<='Z')
        {
            char ch2=Character.toLowerCase(ch);
            System.out.println("Lower case of "+ch+" is: "+ch2);
        }
        else
        {
            char ch2=Character.toUpperCase(ch);
            System.out.println("Upper case of "+ch+" is: "+ch2);
        }
        sc.close();
    }
}
