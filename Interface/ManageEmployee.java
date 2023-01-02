interface Employee 
{
    void getSalary();
    default void giveBonus()
    {
        System.out.println("giving bonus of 1k");
    }
}
interface Relative
{
    void getReference();
}
class Manager implements Employee,Relative
{
    @Override
    public void getReference() {
        System.out.println("Reffering into Infosys");
    }
    @Override
    public void getSalary() {
        System.out.println("Getting Salary of 18K ");
        
    }
}
public class ManageEmployee {

    public static void main(String[] args) {
        
        Manager m=new Manager();
        m.getReference();
        m.getSalary();
    }
}