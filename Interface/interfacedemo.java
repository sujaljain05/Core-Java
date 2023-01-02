import java.util.Scanner;

interface client
{
    void input();    // by default public+abstract
    void output();   // by default public+abstract
}
class Manish implements client
{
    String name; 
    double salary;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username");
        name=sc.nextLine();
        System.out.println("Enter the salary:");
        salary=sc.nextDouble();

        sc.close();
    }
    public void output()
    {
        System.out.println("Username is: "+name);
        System.out.println("Salary is:"+salary);
    }
}

class interfacedemo{
    public static void main(String[] args) 
    {
        client c=new Manish();
        c.input();
        c.output();
    }
}