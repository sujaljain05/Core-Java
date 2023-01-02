public class Cla {
    public static void main(String[] args) 
    {
        //command line argument    
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[0]+args[1]);

        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);

        Integer i=Integer.parseInt(args[0]);
        Float f=Float.parseFloat(args[1]);
        Double d=Double.parseDouble(args[2]);
        Byte b=Byte.parseByte(args[3]);
        Short s=Short.parseShort(args[4]);
        Boolean bool=Boolean.parseBoolean(args[5]);
        Long l=Long.parseLong(args[6]);
        Character c=args[7].charAt(0);

        
        System.out.println("The sum is: "+(num1+num2));

    }
}
