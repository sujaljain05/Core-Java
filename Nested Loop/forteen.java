//      1
//     121
//    12321
//   1234321
//  123454321

public class forteen {
    public static void main(String[] args) {
        
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<4-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++)
            {
                System.out.print(k+1);
            }
            for(int l=0;l<i;l++)
            {
                System.out.print(i-l);
            }
            System.out.println();

        }
    }
}
