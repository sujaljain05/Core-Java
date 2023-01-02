import java.io.*;

public class FileOp1 
{

    static void readFile() throws FileNotFoundException,IOException
    {
        FileInputStream f=new FileInputStream("Hello.txt");

        System.out.println((char)f.read());
        System.out.println((char)f.read());
        System.out.println((char)f.read());
    }
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        readFile();
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

        
    }
}
