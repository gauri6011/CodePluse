public class NarrowingOp {
    public static void main(String[] nop) {
        long value1= 57549823;
        byte value2= (byte) value1;
        System.out.println(value2);
    }
    
}

/* output:
 * compile time successful
 * runtime successful
 * -1
 */