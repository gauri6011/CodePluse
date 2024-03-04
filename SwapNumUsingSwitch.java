import java.util.*;
class SwapNumUsingSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Using third variable (c)
        System.out.println("Enter number 1");
        int num1=sc.nextInt();
        System.out.println("Enter number 2");
        int num2=sc.nextInt();
        int c=0;
        System.out.println("the value of num1 & num2 before Swapping is"+num1 +":"+num2);
        c=num1;
        num1=num2;
        num2=c;
        System.out.println("the value of num1 & num2 after Swapping is"+num1 +":"+num2);

    }
    
}

/*OUTPUT:
compile time success
run time success 
Enter number 1
45
Enter number 2
56
the value of num1 & num2 before Swapping is45:56
the value of num1 & num2 after Swapping is56:45
 */
