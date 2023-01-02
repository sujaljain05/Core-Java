import java.util.Scanner;

public class sphere {
    public static void main(String args[])
    {
        float pi=3.14f,r;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius:");
        r=sc.nextFloat();
        System.out.println("Volume of sphere is:"+pi*r*r*r);
        sc.close();
    }
}
