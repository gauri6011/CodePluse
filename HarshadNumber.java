public class HarshadNumber {
    public static void main(String[] args) {
        int num=21;
        int num1=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        if(num1%sum==0){
            System.out.println("Given number is harshad Number");
        }
        else{
            System.out.println("Given number is not harshad Number");
        }
    }
}

/*output:
compile time success
run time success
Given number is harshad Number

*/
