public class CalculatePercentage {
    public static void main(String[] args) {
        int CS = 67;
        int AI = 78;
        int WAD = 56;
        int DSBDA = 67;
        int CNS = 90;
        
        //calculate the percentage
        float Total_Marks_Obtained=CS+AI+WAD+DSBDA+CNS;
        System.out.println("Total_Marks_Obtained :" +Total_Marks_Obtained);

        float percentage = ((Total_Marks_Obtained) / 500)*100;
        System.out.println("Percentage is: " +percentage );

        //use type-cast operator
        int percentage1 = (int) percentage;

        //calculate grade using ternary operator
        char Grade=(percentage1 >=90 && percentage1<=100) ? ('A'):((percentage1 <90 && percentage1 >=75) ? ('B'):(percentage1 <75 && percentage1>=55) ?('C'):(percentage1<55 && percentage1>=35) ?('E'):('F'));
        System.out.println("Grade is :" +Grade);

    }
    
}
/*outputa:
 Compile time success
 Run time success
 Total_Marks_Obtained :358.0
 Percentage is: 71.6
 Grade is :C
 */

