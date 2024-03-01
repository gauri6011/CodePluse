public class NestedIfExample {
    public static void main(String[] args) {
        
        boolean isSunny = true;
        int temperature = 25; 

        
        if (isSunny) {
            System.out.println("It's sunny!");

            if (temperature > 30) {
                System.out.println("It's a hot day!");
            } else {
                System.out.println("It's a warm day.");
            }
        } else {
            System.out.println("It's not sunny.");
        }
    }
}

/*OUTPUT:
Compile time success
run time success
It's sunny!
It's a warm day.
 */

