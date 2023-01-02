
public class comparision {
    public static void main(String[] args) {
        //compare
        String name1="Sujal";
        String name2="Sujaljain";

        //1. s1>s2 : +ve value
        //2. s1==s2:  0
        //3. s1<s2 : -ve value

        if(name1.compareTo(name2)==0)
        {
            System.out.println("String are equal");
        }
        else
        {
            System.out.println("String are not equal");
        }
    }
}
