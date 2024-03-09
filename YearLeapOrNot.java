import java.util.Scanner;
class YearLeapOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int Year = sc.nextInt();
        String Result=(Year % 4==0 )?("Given Year is Leap Year"):("Given Year is not Leap Year");
        System.out.println(Result);

    
}
}
/*output:
compile time success
run time success
Enter the Year
2024
Given Year is Leap Year
  */
