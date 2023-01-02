                // Method Overriding
class shape
{
    void draw()
    {
        System.out.println("Can't say shape type");
    }
}  
class square extends shape
{
    @Override
    void draw()
    {
        super.draw();
        System.out.println("Square Shape");
    }
}             

class RuntimePolymorphism
{
    public static void main(String[] args) {
        
        shape s=new square();
        s.draw();

    }
}