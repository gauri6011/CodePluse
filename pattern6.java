public class pattern6 {
    public static void main(String[] args) {
        
        int a=6;
       for (int i=1; i<=4; i++){
           for(int j=1; j<=4; j++){
               if (j==(a-i+1) || i == 1 || j==1 || i==4 || j==4 || i==j){
                   System.out.print(" * ");
               } else{
                   System.out.print("   ");
               }
           }
           System.out.println();
        }
   }
}
/*output:
compile time success
 run time success
 *  *  *  * 
 *  *     *
 *     *  *
 *  *  *  *
 */
