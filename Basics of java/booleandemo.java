import java.util.Scanner;
public class booleandemo {
    public static void main(String args[]) {
    
        boolean isAlive;
        System.out.println("He is alive or not");
        Scanner sc=new Scanner(System.in);
        
        isAlive=sc.nextBoolean();

        // System.out.println("The answer is: "+isAlive);

        if(isAlive)
        {
            System.out.println("He is alive");
        }
        else{
            System.out.println("He is not alive");
        }

        sc.close();
    
    }
}
