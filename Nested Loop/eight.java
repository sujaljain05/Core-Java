// 8.
// A
// AB
// ABC
// ABCD
// ABCDE


public class eight {
    public static void main(String[] args) {
        
        for (char i='A'; i < 'F'; i++) 
        {
            for(char j='A';j<i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();    
        }
    }
}
