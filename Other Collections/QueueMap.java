import java.util.ArrayDeque;
import java.util.Queue;


public class QueueMap {
    public static void main(String[] args) {
        
        // Queue<String> line=new ArrayDeque<>();
        ArrayDeque<String> line=new ArrayDeque<>();           // Another way to declare Queue

        line.add("Prince");
        line.add("Sujal");
        line.add("Sumit");
        line.add("Prince");
        line.add("Akash");
        line.add("Mayank");

        System.out.println(line);

        line.remove();
        System.out.println(line);
        line.add("Rahul");
        System.out.println(line);

        // boolean status=line.add("Bharat");
        boolean status=line.offer("Aashish");  // Use offer than add
        

        if(status)
        {
            System.out.println("Element added successfully");
        }
        else
        {
            System.out.println("Element not added");
        }

        System.out.println(line);

        line.poll();     // if empty then give null
        line.remove();  // if empty then throw exception

        System.out.println(line);

        // line.clear();     // clear all data
        System.out.println(line.poll());  // if not empty then will remove the first element. If empty then return null.

        line.addFirst("Lalit");   // Add at the first position
        System.out.println(line);
        line.pollLast();  // will remove the last element
        System.out.println(line);
        System.out.println(line.peek());
        

        // Note:-  Use offer rather than add    and    peek to chck and poll for remove 
    
    }    
}
