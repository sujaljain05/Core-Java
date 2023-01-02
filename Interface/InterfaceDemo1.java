interface customerRaj
{
    int amount=5;            // public+static+final
    void purchase();      // public+abstract
}
class sellerSanju implements customerRaj
{
    @Override
    public void purchase()
    {
        // amount=5;  final
        System.out.println("Raj needs "+amount+" Kg Rice");
    }
}
public class InterfaceDemo1 {
    public static void main(String[] args) {
        customerRaj R=new sellerSanju();
        R.purchase();
        System.out.println(customerRaj.amount);    // variable is static 
    }
}
