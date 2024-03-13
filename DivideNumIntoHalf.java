public class DivideNumIntoHalf {
    public static void main(String[] args) {
        int count=0;
        int num=1234;
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
            
// print into two equal parts
            int f_half=num1/divisor;
            int l_half=num1%divisor;

            System.out.println("First Half Part is " + f_half);
            System.out.println("Last Half Part is "+ l_half);

        }
        else
        {
            System.out.println("The number is having odd number of digit");
        }
        
    }
}
