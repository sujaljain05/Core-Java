import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns in Matrix:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int a[][]=new int[row][col];

        System.out.println("Enter Array Data:");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array Matrix:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
