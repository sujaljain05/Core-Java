import java.util.Scanner;
class StringDemo
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        // System.out.println("Enter one word:");
        // String s1=sc.next();
        // sc.nextLine();
        // System.out.println("Enter a sentence:");
        // String s2=sc.nextLine();

        // System.out.println("First string is: "+s1);
        // System.out.println("Second string is:"+s2);

        String names[]=new String[4];

        names[0]="Sujal";
        names[1]="Sujal 1";
        names[2]="Sujal 3";
        names[3]="Sujal 4";

        names[2]="Akash";

        for (String s : names) 
        {
            System.out.println(s);
        }

        for (int i = 0; i < names.length; i++) 
        {
            System.out.println("At position "+i+" value is: "+names[i]);
        }



        sc.close();
    }
}