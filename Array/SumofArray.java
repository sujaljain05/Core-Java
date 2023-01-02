public class SumofArray {
    public static void main(String[] args) {
        
        int a[]={1,2,3,4,5};
        int sum=0;

        System.out.println("Array Elements are:");

        for (int i = 0; i < a.length; i++) 
        {
            System.out.println(a[i]+" ");
            sum=sum+a[i];
        }
        System.out.println("Addition of Array Elements are:"+sum);

    }
}
