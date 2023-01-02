import java.util.Scanner;

public class StringDemo1 {

    public static void main(String[] args) {
        
        String n="Aman Tiwari";
        System.out.println(n);
;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String n2=sc.next();//one word
        // String n2=sc.nextLine();//one Sentence
        System.out.println("the value of n2 is "+n2);

        String s2=new String("Hello aman");//bad programming practice
        System.out.println(s2);

        String details="Name :Aman \n Address : Noida \n Company : infosys";
        System.out.println(details);

        String name="Aman";
        String address="Noida";

        System.out.println(name+" "+address);

        "Xyz".getClass().getName();
        System.out.println("Xyz".getClass().getName());

        // String s2="Aman"; //String constant pool
        String s3=new String("Aman");//Heap Memory

        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));

        sc.close();
    }
}