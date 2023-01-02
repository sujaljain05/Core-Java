//Byte Stream
//Character Stream

import java.io.*;
class FileHandling1
{
    public static void main(String[] args)
        {
            try{
                InputStream Is=new FileInputStream("Hello.txt"); 
                BufferedInputStream Bis=new BufferedInputStream(Is);
                // System.out.println((char)Is.read());
                // System.out.println((char)Is.read());
                // System.out.println((char)Is.read());
                // System.out.println((char)Is.read());
                // System.out.println((char)Is.read());

                int i;
                while( (i=Is.read())!=-1)
                {
                    System.out.print((char)i);
                }
                // System.out.println((char)Bis.read());

                byte arr[]=Bis.readAllBytes();
                // String s=new String(arr);
                // System.out.print(s);

                // System.out.println(new String(arr));

            }
            catch(FileNotFoundException e)
            {
                System.out.println(e);
            }
            catch(IOException e)
            {
                System.out.println(e);
            }        
    }
}