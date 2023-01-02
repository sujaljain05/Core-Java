import java.io.*;

class CreateFile
{
    public static void main(String[] args) {
        
        File f=new File("D:\\Java\\File Handling\\LearnCoding\\Hello.txt");
        try
        {
            if(f.createNewFile())
        {
            System.out.println("File successfully created");
        }
        else
        {
            System.out.println("File Already exits");   
        }
        }
        catch(IOException e)
        {
            System.out.println("Exception Handled");
        }
        

    }
}