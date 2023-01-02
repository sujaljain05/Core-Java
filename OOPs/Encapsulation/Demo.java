package mega.faculty;
class Teacher          // public protected default
{
    public String name;
    protected String tid;
    private double salary;
    String skills[];        // default

    Teacher()
    {
        name="Jain";
        tid="200";
        salary=1000000;
        skills=new String[]{"React","Javascript"};
    }
    void show()
    {
        System.out.println("My name is:"+name);
        System.out.println("My id is:"+tid);
        System.out.println("My salary is:"+salary);
        System.out.println("My skills is:"+skills[0]+","+skills[1]);
    }
}

class Demo
{
    public static void main(String[] args) {
        
        Teacher T=new Teacher();
        // T.name="Sujal";
        // System.out.println(T.name);
        // T.tid="100";
        // System.out.println(T.tid);
        // // T.salary=9999999;
        // // System.out.println(T.salary);
        // T.skills=new String[]{"java"};
        // System.out.println(T.skills[0]);

        // T.skills=new String[5];
        // T.skills[0]="java";
        // // T.skills[1]="Python";
        // System.out.println(T.skills[0]);
        // System.out.println(T.skills[1]);
        //Access Modifier - public private protected
        //Non-access Modifier- default
        T.show();

    }
}