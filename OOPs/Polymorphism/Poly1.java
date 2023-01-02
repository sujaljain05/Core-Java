class Shape
{
    //to achieve method overloading the no. of argument and the data type of argument must be different.
    void printDim()
    {
        System.out.println("no shape is defined");
    }
    void printDim(byte aa)
    {
        System.out.println("it may be a line or ray in byte type");
    }
    void printDim(int aa)
    {
        System.out.println("it may be a line or ray in int type");
    }
    void printDim(float b)
    {
        System.out.println("it may be a line or ray in float type "+b);
    }
    void printDim(double b)
    {
        System.out.println("it may be a line or ray in double type");
    }
    void printDim(char a)
    {
        System.out.println("u called a character argument fxn");
    }
    void printDim(int a,int b)
    {
        System.out.println("Any Two D shape ");
    }
}



public class Poly1 {

    public static void main(String[] args) {
        
        Shape s=new Shape();

        // s.printDim();
        // s.printDim(23);
        // s.printDim(9999999999l);
        // s.printDim(23.5f);
         s.printDim();
        // s.printDim('A');
        // s.printDim(10, 20);
        // s.printDim((byte)10);
    }
}