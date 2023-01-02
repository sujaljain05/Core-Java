class NewKeyword
{
    int a=10;      // instance variable
    public static void main(String[] args) {
        
        // System.out.println(a);          // can't access instance variable without object

        NewKeyword n=new NewKeyword();
        System.out.println(n.a);

    }
}