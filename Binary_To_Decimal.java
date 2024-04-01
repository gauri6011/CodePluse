public class Binary_To_Decimal {
    public static void main(String[] args) {
        int num=100001;
        int num1=0;
        int b=1;
       
        while(num>0){
            int rem=num%10;
            num1=num1+(b*rem);
            num=num/10;
            b=b*2;
        }
        System.out.println("Decimal Number is " +num1);   
    }  
}


/*OutPut: 
compile time success
runtime success
Decimal Number is 33
*/