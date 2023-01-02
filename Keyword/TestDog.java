class Dog
{
    private String name;
    private double weight;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() 
    {
        return "Dog [name=" + name + ", weight=" + weight + "]";
    }
}


public class TestDog {
    public static void main(String[] args) {
        
        Dog d=new Dog();
        d.setName("Bolt");
        d.setWeight(14.5);
        System.out.println(d);

    }
}
