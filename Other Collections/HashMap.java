import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

class HashMapDemo2
{
    public static void main(String[] args) {
        

        LinkedList<String> ll=new LinkedList<String>();

        // ll.add("sumit 1");
        // ll.add("sumit 2");
        // ll.add("Prity");
        // ll.add("Prity");
        // ll.add("sujal");
        // ll.add("aakash");
        // ll.add("jatin");

        // System.out.println(ll);
        // ll.removeIf(item -> (item.equals("Prity")));

        // System.out.println(ll);


        Map<String,Object> aadharCard=new HashMap<>();

        aadharCard.put("Name","Aman");
        aadharCard.put("address", "Niit 62 Noida");
        aadharCard.put("AadharNumber", 123456789);
        // aadharCard.put("AadharNumber", 454646565);
        // aadharCard.put("AadharNumber", 3243454657l);
        aadharCard.put("fathers name","xyz");
        aadharCard.put("DOB", "22/4/1999");

        // System.out.println(aadharCard);

        Set<Entry<String,Object>>  sets=aadharCard.entrySet();

        for (Entry<String,Object> entry : sets) 
        {  
            System.out.println(entry.getKey()+"   :  "+entry.getValue());
        }

        System.out.println(aadharCard.keySet());
        System.out.println(aadharCard.values());
        
    }
}