import java.util.Scanner;

class Building
{
    String owner="Aman";
    float rooms;
    float floor;
    String address;

    Building(float h,float w,String sp)
    {
        rooms=h;
        floor=w;
        address=sp;
    }
    void showDetails()
    {
        System.out.println("the rooms is "+rooms);
        System.out.println("the floor is "+floor);
        System.out.println("the address is "+address);
        System.out.println("the owner is "+owner);
    }
}
public class valuesettype3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rooms ");
        float r=sc.nextFloat();
        System.out.println("Enter the floor ");
        float f=sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter the address ");
        String addr=sc.nextLine();

        Building t3=new Building(r,f,addr); 
        t3.showDetails();

        System.out.println("==========================");
        
        Building t4=new Building(15,3,"Delhi"); 
        t4.showDetails();


        sc.close();
    }
}

// class Building
// {
//     //constructor is a special type of method which is used to initialiaze the data members of a class
//     int a;//declaration of variable
//     Building() //same as class name and no return type
//     {
//         a=50;//initialization of variable a
//         System.out.println("Hello i am a default constructor");
//     }
// }