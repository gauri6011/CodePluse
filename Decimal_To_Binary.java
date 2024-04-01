public class Decimal_To_Binary 
{
    public static void main(String[] args) 
    {
    int num=10;
    int num1=num;
    int binary=0;
    int a=1;
    while(num1>0)
    {
        int rem=num1%2;
        binary=binary+(rem*a);
        a=a*10; 
        num1=num1/2;
    }
       System.out.println("Binary value of " +num +" is " +binary);
    }
}

/*Output:
compile time success
run time success
Binary value of 10 is 1010
 */
