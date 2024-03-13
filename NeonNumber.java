class NeonNumber {
    public static void main(String[] args) {
        int num=9;
        int num1=num;
        int sum=0;
        // find square
        int square=num*num;
        // add the square digit
        while(square>0){
            int r=square%10;
            sum=sum+r;
            square=square/10;
        }
        if(sum==num1){
            System.out.println("Given number is neon");
        }else{
            System.out.println("Given number is not neun");
        }
    } 
}

/*OutPut:
compile time success
run time success
Given number is neon
 */
