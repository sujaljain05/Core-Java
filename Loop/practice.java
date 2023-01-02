import java.util.Scanner;
public class practice {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);

        // int arr[]={70,80,75,85,90};
        int arr[]=new int[5];
        int total=0;
        float per;

        System.out.println("Enter the marks in Physics,Maths,English,Chemistry,Hindi");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            total=total+arr[i];
        }
        System.out.println("Total marks is: "+total);
       
        per=total/5;
        System.out.println("Percentage is: "+per);
        
        sc.close();
    }    
}
