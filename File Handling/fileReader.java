import java.io.*;

public class fileReader {

    public static void main(String[] args) {
        
        try
        {
            FileReader F=new FileReader("D:\\Java\\File Handling\\LearnCoding\\Hello.txt");
            try
            {
                int i;
                while((i=F.read())!=-1)
                {   
                    System.out.println((char)i);
                }
            }
            finally
            {
                F.close();
            }
        }
        catch(IOException e)
        {
            System.out.println("Exception Handled");
        }
    }
}
