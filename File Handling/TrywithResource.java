import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TrywithResource {
    public static void main(String[] args) {
        
        InputStream Is=null;
        BufferedInputStream Bis=null;
        try{
            Is=new FileInputStream("Hello.txt"); 
            Bis=new BufferedInputStream(Is);
            System.out.println((char)Is.read());

            // int i;
            // while( (i=Is.read())!=-1)
            // {
            //     System.out.print((char)i);
            // }

        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }   
        finally
        {
            try{
                if(Bis!=null && Is!=null)
                {
                    Is.close();
                    Bis.close();
                }
                
                System.out.println("Resource closed");
                }
                catch(IOException e)
                {

                }
            }
        }
    }
