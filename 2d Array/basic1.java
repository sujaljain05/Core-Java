import java.util.Scanner;

class basic1
{
    public static void main(String args[])
    {
        // int arr[3][2];
        int arr[][]=new int[2][3];
        Scanner sc =new Scanner(System.in);

        System.out.println("Rows in matrix are: "+arr.length);        // for rows
        System.out.println("Columns in matrix are: "+arr[0].length);  // for columns

        System.out.println("enter the value in arr");
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[0].length; j++) 
            {
                arr[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("the array is ");
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[0].length; j++) 
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
