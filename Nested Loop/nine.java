

// 9.
// A
// BB
// CCC
// DDDD
// EEEEE
public class nine {
    public static void main(String[] args) {
        
        for(char i='A';i<'F';i++)
        {
            for(char j='A';j<i+1;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
