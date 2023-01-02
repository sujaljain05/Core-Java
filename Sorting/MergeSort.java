public class MergeSort {
    public static void main(String[] args) {
        
        int arr1[]={2,3,5,8,9,10,12,15};
        int arr2[]={4,7,9,11,14};

        int arr3[]=new int[arr1.length+arr2.length];

        int i=0,j=0,k=0;

       while(arr1[i]<arr1.length && arr2[j]<arr2.length)
       {
            if(arr1[i]<=arr2[j])
            {
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else
            {
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length)
        {
            arr3[k]=arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length)
        {
            arr3[k]=arr1[j];
            j++;
            k++;
        }

        for (k=0; k < arr3.length; k++) {
            System.out.print(arr3[k]+" ");
        }

    }
}
