import java.util.Scanner;
class Else_If {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) 
        {
            System.out.println("The number is positive.");
        } 
        else if (number < 0) 
        {
            System.out.println("The number is negative.");
        } 
        else 
        {
            System.out.println("The number is zero.");
        }
    }
}

/*OUTPUT:
comple time success
run time success
Enter a number: 56
The number is positive.
Enter a number: -55 
The number is negative.
 */

