import java.util.Scanner;

public class quadrant {
    public static void main(String args[]) {
        
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coordinates: ");
        x=sc.nextInt();
        y=sc.nextInt();

        if(x>0 && y>0)
        System.out.println((+x+","+y)+" is in first quadrant");
        else if(x>0 && y<0)
        System.out.println((+x+","+y)+" is in forth quadrant");
        else if(x<0 && y<0)
        System.out.println((+x+","+y)+" is in third quadrant");
        else
        System.out.println((+x+","+y)+" is in second quadrant");
        sc.close();
    }    
}
