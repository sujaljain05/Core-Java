//  * * * * *
//   * * * *
//    * * *
//     * *
//      *

public class thirteen {
    public static void main(String[] args) {
        
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5-i;j++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
            for(int k=0;k<i+1;k++)
            {
                System.out.print(" ");
            }
        }
    }
}
