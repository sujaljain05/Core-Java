import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class fileReader1 {
    public static void main(String[] args) {
        
        try
        {
            File r=new File("D:\\Java\\File Handling\\LearnCoding\\Hello.txt");
            Scanner sc=new Scanner(System.in);

            while(sc.hasNextLine())
            {
                System.out.println(sc.hasNextLine());
                System.out.println(sc.nextLine());
                System.out.println(sc.hasNextLine());
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception Handled");
        }
    }    
}
