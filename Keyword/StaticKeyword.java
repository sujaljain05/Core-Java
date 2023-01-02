class StaticKeyword
{
    static String s="Mega";
    String s1="Institute";

    void show()
    {
        System.out.println("Hello");
    }
    static void Test()
    {
        System.out.println("I am static method");
        // System.out.println(s1);  // error
        System.out.println(s);
        StaticKeyword S=new StaticKeyword();
        System.out.println(S.s1);
    }
public static void main(String[] args) {
    
    StaticKeyword s=new StaticKeyword();
    s.show();
    StaticKeyword.Test();
}
}
