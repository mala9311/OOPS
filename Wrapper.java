public class Wrapper {
    public static void main(String[] args) {
        int a = 25;
        //Converting primitive datatype to object
        Integer i = Integer.valueOf(a);
        Integer j = a; // autoboxing
        // converting object to primitive data type
        int b = i.intValue();
        int c = i; // onboxing
        System.out.println("primitive =" + a);
        System.out.println("Wrapper class =" + i);
        
    }
    
}
