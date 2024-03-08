public class Primenumber {
    public static void main(String[] args) {
        int count=0;
        int a=34;
        int b=2;
        while(b<a){
            if(a%b==0){
                count++;
            }
            b++;
        }
        if(count==0)
        {
            System.out.println(a +" is prime number");
        }
        else{
            System.out.println(a+" is not prime number");
        }
    }
}

/*Output:
 * compile time success
 * runtime success
 * 34 is not prime number
 */
