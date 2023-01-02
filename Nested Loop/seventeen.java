// 1
// 0 1
// 0 1 0
// 1 0 1 0
// 1 0 1 0 1




public class seventeen {
    public static void main(String[] args) {
        
        int num=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                    System.out.print(num+" ");

                    if(num==1){
                        num--;
                    }
                    else{
                        num++;
                    }

            }
            System.out.println();
        }
    }
}
