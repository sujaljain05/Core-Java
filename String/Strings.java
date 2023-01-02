import java.util.Scanner;

class Strings{
    public static void main(String[] args) {
        
        // String name="Sujal Jain";    // String declaration
        // String sentence="My name is sujal jain";
        // System.out.println(name);
        // System.out.println(sentence);

        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Your name is:"+name);
        sc.close();
    }
}