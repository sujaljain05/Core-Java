import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Method {
    public static void main(String[] args) {
        
        ArrayList<Integer> A=new ArrayList<>();
        ArrayList<Integer> B=new ArrayList<>();
        ArrayList<Integer> C= new ArrayList<>();

        A.add(10);
        A.add(11);
        A.add(12);
        A.add(13);
        A.add(14);
        A.add(15);

        

        B.add(16);
        B.add(17);
        B.add(18);
        B.add(19);
        B.add(20);
        B.add(21);
        B.add(13);
        B.add(14);
        B.add(15);

        System.out.println(A.addAll(B));
        System.out.println(List.of(B));
        System.out.println(A);
        System.out.println(B);

        // A.addAll(B);   // will add another array list elements in it.
       

        // A.addAll(2, B);
        // System.out.println(A); // will add elements from given index.

        System.out.println(A.contains(18));  // if contains then true else false
        System.out.println(A.contains(12));  // if contains then true else false
        System.out.println(A.containsAll(B));   // check all the elements of B present in A or not
        System.out.println(A.isEmpty());       // false-->  if empty then true else false
        System.out.println(C.isEmpty());       //true-->   if empty then true else false
        System.out.println(A.size());          // size of array list
        // A.clear();
        // System.out.println(A);
        B.remove(3);  // will remove the element of given index
        System.out.println(B);
        B.removeAll(A);  // will remove the all elements of A
        System.out.println(B);
        B.retainAll(A);  
        System.out.println(A.equals(B));   // check equal or not
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(A.hashCode()); 
        System.out.println(B.hashCode());  // if no elements give output- 1
        System.out.println(C.hashCode());  // 1
        System.out.println(A.toArray());

        Iterator<Integer> Itr=A.iterator();

        while(Itr.hasNext())
        {
            System.out.println(Itr.next());
        }
        
        A.forEach(
            (e) ->{System.out.println(e);}
        );

        A.forEach(e->System.out.print(e+" "));

        System.out.println();
        A.retainAll(Arrays.asList(10,11));
        System.out.println(A);
    }
}
