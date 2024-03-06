public class DoWhileReverseNo {

        public static void main(String[] args) {
    // print reverse value
            int a=12345;
            int reverse=0;
            do{
                int r=a%10;
                // change place value so we neet to multiply by 10
                reverse=(reverse*10)+r;
                a=a/10;
            }while(a>0);
            System.out.println(reverse + " is reverse value");
        }
    }   

    /*
      output:
      compile time success
      runtime success
      54321 is reverse value
     */
