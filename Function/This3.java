class Shape
{
    float length;
    float width;
    String name;
    String creator;
    Shape()
    {
        // System.out.println("Hello i am default constructor");
        creator="Aman";
    }
    Shape(float length)
    {
        this();
        //this() must be first line in the constructor
        this.length=length;
    }
    Shape(float length,float width)
    {
        this(length);
        this.width=width;
    }
    Shape(float length,float width,String name)
    {
        this(length, width);
        this.name=name;
    }

    void showDetails()
    {
        System.out.println("==========================================");
        System.out.println("Length =  "+length);
        System.out.println("Width =  "+width);
        System.out.println("Name =  "+name);
        System.out.println("Creator =  "+creator);
    }
}
public class This3 {
    public static void main(String[] args) 
    {
        
        Shape s=new Shape();
        s.showDetails();
        Shape s1=new Shape(45.2f);
        s1.showDetails();
        Shape s2=new Shape(12.2f,23);
        s2.showDetails();
        Shape s3=new Shape(45,56,"Triangle");
        s3.showDetails();
        

    }
}


