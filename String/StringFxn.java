public class StringFxn {
    public static void main(String[] args) {
        
        // String s="This Is A Sentence";
        // System.out.println(s.length());

        // String s1="     This is a      sentence       ";
        // System.out.println(s1.trim());
        // System.out.println(s1.trim().length());

        // System.out.println(s.toLowerCase());
        // System.out.println(s.toUpperCase());

    //     String s2="Hello Sujal";
    //     System.out.println(s2.charAt(6));
    //     System.out.println(s2.codePointAt(6));   // return ASCII Value
    //     System.out.println(s2.concat("Jain"));

    //     String n1="Sujal";
    //     String n2="Sujal";
    //     String n3="sUjAl";
    //     System.out.println(n1.equals(n2));   // Check value
    //     System.out.println(n1.equalsIgnoreCase(n3));    // Ignore the upper and lower case

    //     String str="Sujal"+" Jain";
    //     System.out.println(str);

    //     String intVal=String.valueOf(10);
    //     System.out.println(intVal);

    //     String sen="This is a sentence";
    //     System.out.println(sen.substring(5));
    //     System.out.println(sen.substring(0, 8));

    //    String arr[]=sen.split(" ");
       
    //    for (String s : arr) 
    //    {
    //     System.out.println(s);
    //    }

    //    String res=String.join("-", arr);
    //    System.out.println(res);

    //    int i=Integer.parseInt("10");
    //    System.out.println(i);

    //    String str3="Hello Good Morning Good";
    //    System.out.println(str3.contains("Good"));
    //    System.out.println(str3.indexOf("Good"));
    //    System.out.println(str3.indexOf("Good", 7));
    //    System.out.println(str3.lastIndexOf("Good"));

    //    System.out.println(str3.replace("Good", "Wood"));

    //    String n4="Aman";
    //    String n5="Baman";

    //    System.out.println(n4.compareTo(n5));  // ASCII Value    (65-66)=-1

    //    String hc="Aman";
    //    System.out.println(hc.hashCode());

    //    String s5;
    //    String s6="";
    //    String s7="  ";

    // //    System.out.println(s5.isEmpty());  // Error
    //    System.out.println(s6.isEmpty());
    //    System.out.println(s6.isBlank());

    //    System.out.println(s7.isEmpty());
    //    System.out.println(s7.isBlank());

       String s10="Hello ";
       System.out.println(s10.repeat(4));

       byte b[]=s10.getBytes();
       for (byte c : b) 
       {
        System.out.println(c);
       }

       System.out.println(new String(b));

       String s11=new String("Hello");
       String s12=s11.intern();
       String s13="Hello";
       System.out.println(s12==s13);

       String m1="Name";
       String m2="Aman";

       String result=m1+String.format("%12s", m2);
       System.out.println(result);

       String result2="My name is"+String.format("%10s", m2);
       System.out.println(result2);
    }
}

// is empty is blank intern format getbyte repeat 