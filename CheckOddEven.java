
class CheckOddEven {
    public static void main(String[] args) {
        //Add two numbers
        int a = 15;
        int b = 10;
        int sum1 = a+b;
        System.out.println("The sum of a and b is :" +sum1);

        //print first digit
        int c = sum1 / 10;
        System.out.println("First Digit is :" +c);
        //Print last digit
        int d = sum1 % 10;
        System.out.println("Last Digit is :" +d);
        
        //sum of two numbers
        int sum2 = c+d;
        System.out.println("The sum of c and d is :" +sum2);

         //To cheak sum of two numbers is odd or even
        String Result= (sum2/2==0) ? "This number is Even" : "This number is Odd";
        System.out.println( "Result :" +Result);

    }
    
}

/*OUTPUT:
compile time success
run time success
The sum of a and b is :25
First Digit is :2
Last Digit is :5
The sum of c and d is :7
Result :This number is Odd
 */

