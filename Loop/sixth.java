import java.util.Scanner;

// 6. Write a program in C to display the multiplication table of a given integer.  
// Test Data :
// Input the number (Table to be calculated) : 15
// Expected Output :
// 15 X 1 = 15
// ...
// ...
// 15 X 10 = 150

public class sixth {
    public static void main(String[] args) {

        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the number: ");
        num=sc.nextInt();

        for(int i=1;i<11;i++)
        {
            System.out.println(+num+" X "+i+" ="+(num*i));
        }
        sc.close();
    }
}
