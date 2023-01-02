import java.util.ArrayList;

public class Comparable {
    public static void main(String[] args) {
        
        ArrayList<Subject> subjects=new ArrayList<>();

        subjects.add(new Subject(100, "C", 1970));
        Subject s1=new Subject(101, "Java", 2000);
        Subject s2=new Subject(101, "Javascript", 2005);
        Subject s3=new Subject(101, "React", 2015);

        subjects.add(s1);
        subjects.add(s2);
        subjects.add(s3);

        Collections.sort(subjects);
        System.out.println(subjects);


    }
}
