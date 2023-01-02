class StrBuild
{
    public static void main(String[] args) {
        
        StringBuffer s1=new StringBuffer();
        System.out.println(s1.length());   
        System.out.println(s1.capacity());   // 16
        s1.append("Sujal");
        System.out.println(s1.length());
        System.out.println(s1.capacity());    
        System.out.println(s1);
        s1.append(" Jain");
        System.out.println(s1.length());  
        System.out.println(s1.capacity());  
        System.out.println(s1);
        s1.append(" Shanu jain");
        System.out.println(s1.length());
        System.out.println(s1.capacity());
        System.out.println(s1);

        s1.replace(0, 5, "Shanu");
        System.out.println(s1);
        s1.insert(7, "Jain");
        System.out.println(s1);
        s1.delete(1, 2);
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);

    }
}