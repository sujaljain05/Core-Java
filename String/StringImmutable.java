public class StringImmutable {

    public static void main(String[] args) {
        

        String name="Aman";

        // name.concat("Tiwari");
        // name=name.concat(" Tiwari");//re-initialization 
        String name3=name.concat(" Tiwari");
        System.out.println(name);
        System.out.println(name3);
    }
}