import java.util.Scanner;;

class ifelse{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ur age : ");

        int age=sc.nextInt();

        if(age>=18)
        {
            System.out.println("You are eligible for vote");
        }
        else
        {
            System.out.println("You are not eligible for vote");
        }
        sc.close();
    }
}