import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {
        
        String n="Aman Tiwari";
        System.out.println(n);
;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        // String n2=sc.next();//one word
        String n2=sc.nextLine();//one Sentence
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

        sc.close();

    }
}
