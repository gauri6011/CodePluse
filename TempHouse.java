import java.util.Scanner;

public class TempHouse {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temperature = sc.nextDouble();
        String Result=(temperature > 25 &&(temperature % 5 == 0 && temperature % 7 == 0))?("Suitable for making house"):("Not Suitable for making house");
        System.out.println(Result);
    }
}

/*OutPut:
 * compile time success
 * run time success
 * Enter the temperature: 70
   Suitable for making house
 */
