import java.util.Scanner;

class Multiplication
{
    public static void main(String[] args) {
        
        int r1,c1,r2,c2;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter row and column of 1st matrix ");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("Enter row and column of 2nd matrix ");
        r2=sc.nextInt();
        c2=sc.nextInt();

        if (c1==r2)
        {
            System.out.println("Multiplication is possible");
            int matr1[][]=new int[r1][c1];
            int matr2[][]=new int[r2][c2];
            int matr3[][]=new int[r1][c2];


            System.out.println("Enter the 1st matrix ");
            for (int i = 0; i < r1; i++) //matr1.length => for row
            {
                for (int j = 0; j < c1; j++)  //matr1[0].length => column
                {
                    matr1[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the 2nd matrix ");
            for (int i = 0; i < r2; i++) //matr1.length => for row
            {
                for (int j = 0; j < c2; j++)  //matr1[0].length => column
                {
                    matr2[i][j]=sc.nextInt();
                }
            }
            //logic

            for (int i = 0; i < r1; i++) 
            {
                for (int j = 0; j < c2; j++) 
                {
                    for (int k = 0; k < c1; k++) 
                    {//r2
                        matr3[i][j]=matr3[i][j]+ matr1[i][k]*matr2[k][j];
                    }
                }
            }
            //print
            System.out.println("The resultant matrix is ");
            for (int i = 0; i < r1; i++) 
            {
                for (int j = 0; j < c2; j++) 
                {
                    System.out.print(matr3[i][j]+"  ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Multiplication is not possible");
        }
        sc.close();
    }
}