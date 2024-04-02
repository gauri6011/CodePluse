public class PerfectNumber {
    public static void main(String[] args) {
        int n=28;
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
            if(n==sum)
            {
                System.out.println( +n +" Is Perfect number");
            }
            else
            {
                System.out.println(+n +" Is Not Perfect number");
            }
                
            }
        }

        /*Output:
        compile time success
        runtime success
        28 Is Perfect number
         */
    

