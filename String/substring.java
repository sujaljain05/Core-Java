public class substring {
    public static void main(String[] args) 
    {
        String sentence="My name is sujal";
        // substring(beg index, end index)
        String name=sentence.substring(11,sentence.length());

        System.out.println(name);

        //index will start from 0

        String sentence1="Sujal jain";

        String name1=sentence1.substring(6);
        System.out.println(name1);

        //String are immutable
    }
}
