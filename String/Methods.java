public class Methods {
    public static void main(String[] args) {
        
        String a="SUJAL";
        String b="jain";

        System.out.println(a.toLowerCase());      // sujal
        System.out.println(b.toUpperCase());      // JAIN

        System.out.println(b.concat(a));           // jain SUJAL
        System.out.println(b.length());             // 4

        String c="      Shanu        ";
        System.out.println(c.trim());            // Shanu
        String d="";
        System.out.println(d.isEmpty());      // true

        System.out.println(b.charAt(2));     // i
        System.out.println(a.indexOf('J'));     // 2 

        System.out.println(b.equals(a));    // false

        String e="LEARN";
        System.out.println(e.replace('R', 'E'));    // LEAEN
    }

}
