import java.util.Scanner;
public class MonthsUsingSwitch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of month");
        int Month =sc.nextInt();
        switch(Month){
            case 1:System.out.println("January");
            break;
            case 2:System.out.println("February");
            break;
            case 3:System.out.println("March");
            break;
            case 4:System.out.println("April");
            break;
            case 5:System.out.println("May");
            break;
            case 6:System.out.println("June");
            break;
            case 7:System.out.println("July");
            break;
            case 8:System.out.println("August");
            break;
            case 9:System.out.println("Septmber");
            break;
            case 10:System.out.println("Octomber");
            break;
            case 11:System.out.println("November");
            break;
            case 12:System.out.println("December");
            break;
            default:System.out.println("Invalid");
        }
    }
}

/*Output:
compile time successful
runtime successful
Enter the number of month
4
April
 */
