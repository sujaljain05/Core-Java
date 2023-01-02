

class Shape
{
    float length;
    float width;
    String name;
    String creator;
    Shape()
    {
        System.out.println("Hello I am a default constructor");
        creator="Sujal";
    }
    Shape(float length)
    {
        this.length=length;
    }
    Shape(float length,float width)
    {
        this.length=length;
        this.width=width;
    }
    Shape(float length,float width,String name)
    {
        this();
        this.length=length;
        this.width=width;
        this.name=name;
    }

    void showDetails()
    {
        System.out.println("=======================");
        System.out.println("Length: "+length );
        System.out.println("Width: "+width);
        System.out.println("Name: "+name);
        System.out.println("Creator: "+creator);
    }
}

public class This2 {
    public static void main(String[] args)
    {
        Shape s=new Shape();
        s.showDetails();
        Shape s1=new Shape(45.6f);
        s1.showDetails();
        Shape s2=new Shape(23.0f);
        s2.showDetails();
        Shape s3=new Shape(45.2f,25.2f,"Sujal");
        s3.showDetails();
    }
}
