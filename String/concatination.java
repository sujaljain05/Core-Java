public class concatination {
    public static void main(String[] args) 
    {
        //concatination
        String firstname="Sujal";
        String lastname="Jain";
        String fullname= firstname+" "+lastname;

        System.out.println(fullname);
        System.out.println("Length in String: "+fullname.length());

        //charAt
        for(int i=0;i<fullname.length();i++)
        {
            System.out.println(fullname.charAt(i));
        }


    }
}
