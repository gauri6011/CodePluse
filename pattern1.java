public class pattern1 {
    public static void main(String[] args) {
        for(int i=1; i<=2;i++) //row
        {
            for(int j=1; j<=4;j++)//col
            {
                 System.out.print("*");
            }
            System.out.println( );
        }
    }
}

/*output:
 compile time success
 run time success
 ****
 ****
 */