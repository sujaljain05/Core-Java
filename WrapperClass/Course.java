public class Course 
{
    private String name;
    private double fees;
    private int CourseId;

    public Course(String name, double fees, int courseId) {
        this.name = name;
        this.fees = fees;
        CourseId = courseId;
    }
    public Course() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Course [name=" + name + ", fees=" + fees + ", CourseId=" + CourseId + "]";
    }
    public double getFees() {
        return fees;
    }
    public void setFees(double fees) {
        this.fees = fees;
    }
    public int getCourseId() {
        return CourseId;
    }
    public void setCourseId(int courseId) {
        CourseId = courseId;
    }

    

}