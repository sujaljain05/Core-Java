import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        
        try
        {
            FileWriter f=new FileWriter("D:\\Java\\File Handling\\LearnCoding\\Hello1.txt");
            try
            {
                f.write("Java Programming is the best language");
            }
            finally
            {
                f.close();
            }
            System.out.println("Successfully data wrote in file");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
