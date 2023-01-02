import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Stack;
class Collections
{
    public static void main(String[] args) {
        
        Set<String> nameSet=new HashSet<>();

        // Set will remove the duplicate elements 

        nameSet.add("Sujal");
        nameSet.add("Sumit");
        nameSet.add("Prince");
        nameSet.add("Akash");
        nameSet.add("Mayank");
        nameSet.add("Sumit");
        nameSet.add("Sujal");
        // nameSet.add(10);       // error
        nameSet.add("sujal");

        System.out.println(nameSet);

        System.out.println();
        HashSet<String> hs=new HashSet<>();   

        Set<String> nameSet1=new LinkedHashSet<>();

        // This will also remove the duplicate element and print the string as in given order.

        nameSet1.add("Sumit");
        nameSet1.add("Akash");
        nameSet1.add("Sujal");
        nameSet1.add("Prince");
        nameSet1.add("Mayank");
        nameSet1.add("Sumit");
        nameSet1.add("sumit");
        nameSet1.add("Akash");

        System.out.println(nameSet1);
        System.out.println();

        Set<String> nameSet2=new TreeSet<>();
        // remove the duplicate element and print the string in alphabetical order

        nameSet2.add("Sumit");
        nameSet2.add("Akash");
        nameSet2.add("Sujal");
        nameSet2.add("Prince");
        nameSet2.add("Mayank");
        nameSet2.add("Sumit");
        nameSet2.add("sumit");
        nameSet2.add("Akash");

        System.out.println(nameSet2);
        System.out.println();

        Vector<String> list=new Vector<>();
        // This will print the string in a given order and also print the duplicate element.

        list.add("Sumit");
        list.add("Prity");
        list.add("Sujal");
        list.add("Sumit");
        list.add("Sumit");
        list.add("Sumit");
        list.add("sumit");
        list.add("Aakash");

        System.out.println(list);
        System.out.println();

        Enumeration<String> enums= list.elements();

        while (enums.hasMoreElements()) {
            System.out.println(enums.nextElement());
        }

        Stack<String> box=new Stack<>();
        // This will work on Last In First Out

        box.push("c"); 
        box.push("c++"); 
        box.push("java"); 
        box.push("python");
        System.out.println(box);
        box.add("HTML");
        box.add(2,"javascript");
        System.out.println(box);
        box.pop();
        box.remove(2);
        System.out.println(box);
        System.out.println(box.peek());
        System.out.println(box);
        System.out.println(box.search("java"));


    }

    public static void sort(ArrayList<Subject> subjects) {
    }
}