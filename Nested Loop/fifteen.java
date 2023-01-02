
//           *
//          * * 
//         * * *
//        * * * *
//         * * * 
//        * * * *
//       * * * * *
//      * * * * * *
//       * * * * * 
//      * * * * * *
//     * * * * * * *
//    * * * * * * * *
//        * * * *
//        * * * *
//        * * * *
//        * * * *

public class fifteen {
    public static void main(String[] args) {
        
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<8-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }   
         for(int i=0;i<4;i++)
         {
            for(int j=0;j<6-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i+3;k++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i+5;k++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<4;i++)
        {
             int l=5;
            for(int j=0;j<l;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<4;k++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
