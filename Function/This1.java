class Rooms
{
    float height;

    Rooms(float height)       //parameterized constructor
    {
        // height=height;      // ambiguity between local and instance variable
        this.height=height;    // this represents to current class object
    }
    void showHeight()
    {
        System.out.println("Height is:"+height);
    }
}

public class This1 {
    public static void main(String[] args) 
    {
        Rooms r=new Rooms(45.7f);
        r.showHeight();  
    }
}
