import java.io.*;
class ConsoleClass
{
    public static void main(String[] args) {
        
        Console obj=System.console();
        String str;
        char ch[];
        System.out.println("Enter Username:");
        str=obj.readLine();
        System.out.println("Enter Password");
        ch=obj.readPassword();

        String a=String.valueOf(ch);
        System.out.println("Password is: "+a);
        System.out.println("UserName is: "+str);
        System.out.println("Password is: "+ch);
        
    }
}