public class New {
    public static void main(String[] args) {
        
        String a="Sujal";     // String literal
        String b=new String("Sujal");    // new keyword

        if(a==b)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}

// This will give false becoz object are different.
