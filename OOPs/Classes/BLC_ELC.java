                    // BLC and ELC Program in java

class BLC_ELC
{
    public static void main(String[] args) {
        
        int n=20,m=10,rem;
        rem=n%m;
        System.out.println("Remainder is:"+rem);

        Amazon A=new Amazon();
        A.input();
        A.show();
        Flipkart F=new Flipkart();
        F.input();
        F.show();
    }
}

// Note:- All BLC & ELC class must be in same folder.

// BLC= Buisness Logic Class
// ELC= Executable Logic C