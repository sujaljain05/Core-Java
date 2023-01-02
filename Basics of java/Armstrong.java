

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int result=0,rem,count=0;
        int temp=n;
        while(temp>0)
        {
            count++;
            temp/=10;
        }
        int original=n;
        for(int i=n;i>0;i/=10)
        {
            rem=i%10;
            result+=Math.pow(rem, count);

        }

        if(result==original)
        {
            System.out.println(original+" is a Armstrong number");
        }
        else
        {
            System.out.println("Not Armstrong number");
        }
        sc.close();
    }
}

// import java.util.Scanner;
// class Armstrong
// {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in); bb
//         System.out.println("Enter a number:");
//         int n=sc.nextInt();
//         int result=0,rem;
//         int temp=n;
//         while(temp>0)
//         {
//             rem=temp%10;
//             result=result+(rem*rem*rem);
//             temp/=10;
//         }   
//         if(result==n)
//         {
//             System.out.println("Armstrong number");
//         }
//         else
//         {
//             System.out.println("NOT Armstrong number");
//         }
//         sc.close();
//     }
// }
