import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter base : ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        System.out.print("Enter side: ");
        double side = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        System.out.print("Enter Length: ");
        double length = sc.nextDouble();
        System.out.println("Choose a geometric object to calculate its area: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                areaOfCircle(radius);
                break;
            case 2:
                areaOfTriangle(base, height);
                break;
            case 3:
                areaOfSquare(side);
                break;
            case 4:
                 areaOfRectangle(length, width);
                break;
            case 5:
               areaOfCylinder(radius ,height);
                break;
            case 6:
                areaOfSphere(radius);
                break;
            case 7:
                areaOfHemisphere(radius);
                break;
            case 8:
                areaOfCube(side);
                break;
            default:
                System.out.println("Invalid");
        }
    }

    public static void areaOfCircle(double radius){
        double area1 = 3.14 * radius * radius;
        System.out.println("Area of the circle: " + area1);
    }

    public static void areaOfTriangle(double base, double height) {
        double area2 = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area2);
    }

    public static void areaOfSquare(double side) {
        double area3 = side * side;
        System.out.println("Area of the square: " + area3);
    }

    public static void areaOfRectangle (double length, double width) {
        double area4 = length * width;
        System.out.println("Area of the rectangle: " + area4);
    }

    public static void areaOfCylinder(double radius, double height) {
        double area5 = 2 * 3.14 * radius * (radius + height);
        System.out.println("area of the cylinder: " + area5);
    }

    public static void areaOfSphere(double radius) {
        double area6 = 4 * 3.14* radius * radius;
        System.out.println("area of the sphere: " + area6);
    }

    public static void  areaOfHemisphere(double radius) {
        double area7 = 3 * 3.14 * radius * radius;
        System.out.println("area of the hemisphere: " + area7);
    }

    public static void areaOfCube(double side) {
        double area8 = 6 * side * side;
        System.out.println("area of the cube: " + area8);
    }
}


