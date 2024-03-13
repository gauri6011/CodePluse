class TechNumber{
    public static void main(String[] args) {
        int count=0;
        int num=2025;
        int num1=num;
        int num2=num;
        while (num>0) {
            num=num/10;
            count++;
        }
        if(count%2==0)
        {
            //find divisor
            int divisor=1;
            for(int i=1;i<=count/2; i++)
            {
                divisor=divisor*10;
            }
            System.out.println("Divisor = " +divisor);
// print into two equal parts
            int f_half=num1/divisor;
            int l_half=num1%divisor;

            System.out.println("First Half Part is " + f_half);
            System.out.println("Last Half Part is "+ l_half);

            // cheak tech number
            int result=f_half+l_half;
            int FReult=result*result;
            if(FReult==num2){
                System.out.println("Given number is Tech Number");
            }
            else{
                System.out.println("Given number is Not Tech Number");
            }


        }
        else
        {
            System.out.println("The number is having odd number of digit");
        }   
    }
}

/*OutPut:
compile time success
runtime success
Divisor = 100
First Half Part is 20
Last Half Part is 25
Given number is Tech Number
 */