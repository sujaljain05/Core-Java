// 1
// 22
// 333
// 4444
// 55555


public class four {
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
