import java.util.Scanner;
public class MirrorMatrix {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and column in Matrix:");
        int row=sc.nextInt();
        int col=sc.nextInt();

        int a[][]=new int[row][col];

        System.out.println("Enter the Data:");
        
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < col; j++) 
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix Data is:");

        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < col; j++) 
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Mirror Matrix is");
        for (int i = 0; i < row; i++) 
        {
            for (int j = col-1; j >= 0; j--) 
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
