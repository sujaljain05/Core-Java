public class Equals {
    public static void main(String[] args) {
        
        String a="Sujal";
        String b=new String("Sujal");

        String c=new String("Jain");
        String d=new String("Jain");       

        if(a.equals(b))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

        if(c.equals(d))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}

// This will give true becoz this will check the content.
