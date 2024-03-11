class Factorial2To8 {
    public static void main(String[] args) {
        int start=2;
        while(start<=8){
            int i=start;
            int fact=1;
            while(i>0)
        {
              fact=fact*i; 
              i--; 
        }
        System.out.println("The factorial of "+start + " is " +fact);
        start++;
    }   
}
}

/*Output:
compile time success
run time success
The factorial of 2 is 2
The factorial of 3 is 6
The factorial of 4 is 24
The factorial of 5 is 120
The factorial of 6 is 720
The factorial of 7 is 5040
The factorial of 8 is 40320
 */
