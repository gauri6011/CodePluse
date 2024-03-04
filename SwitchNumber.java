import java.util.Scanner;
 class SwitchNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        
        int number = sc.nextInt();
        System.out.println("Enter choice:");
        int Key= sc.nextInt();
        
        switch(Key)
        {
            case 1: if(number%2==0)
            {
                System.out.println("Number is even");
            }
            else
            {
                System.out.println("Number is odd");
            }break;

            case 2: if(number%7==0  || number%10==7)
            {
                System.out.println("number is Buzz");
            }
            else
            {
              System.out.println("number is not buzz");
            }
            break;
            case 3: if(number>=0 ){
                System.out.println("number is positive");
            }
            else{
            System.out.println("number is negative");
            }
            break;
            case 4:if(number<99 && number>10)
            {
                System.out.println("two digit number");
            }
            else{
                System.out.println("not two digit number");
            }
            break;



   
        }
    }
}

/*
 output:
 compile time success
 run time success
 Enter the number:
70
Enter choice:
2
number is Buzz

Enter the number:
345
Enter choice:
4
not two digit number

Enter the number:
44
Enter choice:
1
Number is even

Enter the number:
33
Enter choice:
3
number is positive

 */


    

