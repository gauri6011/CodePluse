import java.util.Scanner;
public class RupeesConvertCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the amount in rupees: ");
        double rupees=sc.nextDouble();
        System.out.println("Enter the choice: ");
        int choice=sc.nextInt();
        switch(choice){
            case 1: doller(rupees);
            break;
            case 2: euros(rupees);
            break;
            case 3: pounds(rupees);
            break;
            case 4: riyals(rupees);
            break;
            default:
            System.out.println("choice not found");
        }
    }
    public static void doller(double rupees){
        double doller=rupees/74.5;
        System.out.println("Amount in Doller: " + doller);
    }
    public static void euros(double rupees){
        double euros=rupees/88.3;
        System.out.println("Amount in ruros: " +euros);
    }
    public static void pounds(double rupees){
        double pounds=rupees/103.2;
        System.out.println("Amount in Pounds: " +pounds);
    }
    public static void riyals(double rupees){
        double riyals=rupees/19.9;
        System.out.println("Amount in Riyals: " +riyals);
    }

}
