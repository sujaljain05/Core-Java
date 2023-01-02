public class Stringbuilder {
    public static void main(String[] args) 
    {
        StringBuilder sb=new StringBuilder("Sujal");
        System.out.println(sb);

        //charAt
        System.out.println(sb.charAt(0));

        //set char at index 0
        // sb.setCharAt(0, 's');
        // System.out.println(sb);

        // sb.insert(0, "S");     // for insert a character
        // System.out.println(sb);

        sb.insert(2, "j");
        System.out.println(sb);

        sb.delete(2,3);     //for delete en element
        System.out.println(sb);

    }
}
