import java.util.*;
class count 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int count=0;
        do{
            int a=num%10;
            num=num/10;
            count++;
        }while(num>0);
        System.out.println("count of Digit is " + count) ;

    }
}

/*output:
Compile Time Successful
Run Time Successful
Enter the number: 
77666
count of Digit is 5
 */
