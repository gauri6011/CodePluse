public class Evil_Number {
    public static void main(String[] args) {
        int num=10010011;
        int num1=num;
        int count=0;
        while(num>0){
            int rem=num%10;
            if(rem==1){
            count++;
        }
        num=num/10;
    }
        if(count%2==0){
            System.out.println(+num1 + " Given number is Evil Number");
        }
        else{
            System.out.println(+num1 + " Given number is Not Evil Number");
        }
    }
}
/*OutPut:
Compile time success
Run time success
10010011 Given number is Evil Number
 */
