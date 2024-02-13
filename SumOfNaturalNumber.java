public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int a =100;
        int sum=a*(a+1)/2;               //formula = n*(n-1)/2
        System.out.println(sum);
        boolean result=sum%2==0;
        System.out.println("Sum of n natural numbers:" +result);
    }
}
    

