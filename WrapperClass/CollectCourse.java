import java.util.ArrayList;
public class CollectCourse 
{
    public static void main(String[] args) {
        
        ArrayList<Course> A=new ArrayList<>();

        Course c1=new Course("Java", 20000, 10);
        Course c2=new Course("Python", 20000, 11);
        Course c3=new Course();
        
        c3.setCourseId(101);
        c3.setFees(15000);
        c3.setName("React");

        A.add(c1);
        A.add(c2);
        A.add(c3);

        System.out.println(A);
    }

}
