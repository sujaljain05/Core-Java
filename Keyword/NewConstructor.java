import java.lang.reflect.Constructor;

public class NewConstructor {

    int a=10;
    NewConstructor()
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        
        NewConstructor n=new NewConstructor();    // call constructor


    }
}
