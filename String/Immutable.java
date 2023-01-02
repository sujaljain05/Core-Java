public class Immutable {
    public static void main(String[] args)
    {
    //    String s="Akash";
       
    //    System.out.println(s.length());

    //    int len="sujal".length();
    //    System.out.println(len);

    //    String s2=new String("Sujal 2.0");  // bad programming practice
    //    System.out.println(s2);

       String n1="Sujal";
       n1.concat("Jain");
       String s3=n1.concat("Jain");

       System.out.println(s3);

       // Reinitialization
       
       String s="Sujal";
       s=s.concat("Jain");
       System.out.println(s);

       String an1="Dog";   // SCP= String constant pool
       String an2=new String("Dog"); // Heap Memory

       System.out.println(an1==an2);  // checking memory address
       System.out.println(an1==an1);  // checking memory address
       System.out.println(an2==an2);  // checking memory address

       String ani3="Dog";
       System.out.println(an1==ani3);
       String ani4="Dog1";
       System.out.println(ani3==ani4);
    }
}
