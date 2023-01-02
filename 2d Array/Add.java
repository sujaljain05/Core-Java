import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int matr[][],matr1[][],matr2[][];
        int r1,c1,r2,c2;

        System.out.println("Enter rows and columns in first matrix: ");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("Enter rows and columns in first matrix: ");
        r2=sc.nextInt();
        c2=sc.nextInt();

        if(r1==r2 && c1==c2)
        {
            System.out.println("Addition is possible ");
            matr=new int[r1][c1];
            matr1=new int[r2][c2];
            matr2=new int[r1][c1];

            System.out.println("Enter first matrix: ");
            for (int i = 0; i < r1; i++) 
            {
                for (int j = 0; j < c1; j++)
                 {
                    matr[i][j]=sc.nextInt();
                 }
            }
            System.out.println("Enter second matrix: ");
            for (int i = 0; i < r2; i++) 
            {
                for (int j = 0; j < c2; j++)
                 {
                    matr1[i][j]=sc.nextInt();
                 }
            }
            for (int i = 0; i < r1; i++) 
            {
                for (int j = 0; j < c1; j++)
                 {
                    matr2[i][j]=matr[i][j]+matr1[i][j];
                 }
            }
            System.out.println("The resultant matrix is: ");
            for (int i = 0; i < r1; i++) 
            {
                for (int j = 0; j < c1; j++)
                 {
                    System.out.print(matr2[i][j]+"  ");
                 }
                 System.out.println();
            }

        }
        else
        {
            System.out.println("Addition not possible");
        }

        sc.close();

    }
}
