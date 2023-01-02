import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) 
    {
        // ArrayList A=new ArrayList();
        ArrayList<Integer> A=new ArrayList<>(); 

        A.add(10);
        A.add(11);
        A.add(12);
        A.add(13);
        A.add(14);
        // A.add("Sujal jain"); // String cannot converted to int

        System.out.println(A);

        // for (int i = 0; i < A.size(); i++) 
        // {
        //     System.out.println(A.get(i).getClass().getName());
        // }

        for (Integer i : A) 
        {
            System.out.println(i);
        }
    }
}
