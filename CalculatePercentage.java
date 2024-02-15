public class CalculatePercentage {
    public static void main(String[] args) {
        int CS = 67;
        int AI = 78;
        int WAD = 56;
        int DSBDA = 67;
        int CNS = 90;
        
        //calculate the percentage
        int Total_Marks_Obtained=CS+AI+WAD+DSBDA+CNS;
        float Per = ((Total_Marks_Obtained) / 500)*100;

        //use type-cast operator
        int percentage = (int) Per;

        //calculate grade using ternary operator
        char Grade=(percentage >=90 && percentage<=100) ?('A'):(percentage <90 && percentage>=75) ?('B'):(percentage<75 && percentage<=55) ?('C'):(percentage<55 && percentage<=35) ?('D'):('f');
        System.out.println("Grade is :" +Grade);

    }
    
}
/*outputa:
 Compile time success
 Run time success
 Grade is :C
 */
