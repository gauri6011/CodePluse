public class Happy_Number {
    public static void main(String[] args) {
        int num = 31;
        int num1 = num;
        int r = 0;
        while (num1 >1) {
            int sum = 0;
            while (num1 > 0) {
                int rem = num1 % 10;
                sum = sum + (rem * rem);
                num1 = num1 / 10;
            }
            num1 = sum;
        }
        if (num1 == 1) {
            System.out.println("Given number is a Happy Number.");
        } else {
            System.out.println("Given number is not a Happy Number.");
        }
    }
}

/*OutPut:
Compile time success
Run time success
Given number is a Happy Number.
 */
