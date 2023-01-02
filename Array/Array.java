                            // toString()  asList()    deepToString()

import java.util.Arrays;
class Array
{
    public static void main(String[] args) {
        
        String a[]={"Sujal","Manish","Ashish","Abhijeet"};

        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.asList(a));

        int arr[][]={{10,20},{30,40}};
        System.out.println(Arrays.deepToString(arr));

    }
}