
import java.util.*;
class SwapnumUsingMulDiv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // With out using third variable (Mul % Div)
        System.out.println("Enter number 1");
        int num1=sc.nextInt();
        System.out.println("Enter number 2");
        int num2=sc.nextInt();
        System.out.println("the value of num1 & num2 before Swapping is"  +num1+" : "+num2);

        //update num1
         num1 =num1*num2;
         
         //updatenum2
         num2=num1/num2;
        
         //update num1
         num1=num1/num2;

         System.out.println("the value of num1 & num2 after Swapping is"  +num1+" : "+num2);
         

    }
}

/*
output:
comple time success
run time success
Enter number 1
45
Enter number 2
23
the value of num1 & num2 before Swapping is45 : 23
the value of num1 & num2 after Swapping is23 : 45
 */

