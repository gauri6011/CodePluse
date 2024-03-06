class DoWhileCountOddEvenDigit 
{
    public static void main(String[] args) {
        int a=53867;
        int odd=0;
        int even=0;
        do 
        {
            int r=a%10;
            if(r%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            a=a/10;
        }while(a>0);
        System.out.println("The number of odd = " + odd  );
        System.out.println("The number of even digit = " +even);

    }
}

/*output:
 compile time success
 run time success
 The number of odd = 3
 The number of even digit = 2
 
 */
