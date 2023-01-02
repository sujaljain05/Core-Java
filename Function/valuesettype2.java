import java.util.Scanner;

class Employee
{
    int empid;
    String name;
    double salary;
    String address;


    void setData(String addr)
    {
        
        Scanner sc=new Scanner(System.in);
        addr=address;
        System.out.println("Enter your id: ");
        empid=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name:");
        name=sc.nextLine();
        System.out.println("Enter your salary:");
        salary=sc.nextDouble();

        sc.close();
        
    }
    void showData()
    {
        System.out.println("-------------Employee Details-------------");
        System.out.println("Employee id: "+empid);
        System.out.println("Employee name:"+name);
        System.out.println("Employee salary:"+salary);
        System.out.println("Address is: "+address);
    }
}

public class valuesettype2 {
    public static void main(String[] args) {
        
        Employee e1=new Employee();
        e1.setData("Noida 62");
        e1.showData();

        Employee e2=new Employee();
        e2.setData("Noida 55");
        e2.showData();

        
    
    }
}

