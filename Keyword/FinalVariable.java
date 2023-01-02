
class FinalVariable
{
    public static void main(String[] args) 
    {
        final int A=10;
        System.out.println(A);

        A=20;             // error
        System.out.println(A);  

    }
}