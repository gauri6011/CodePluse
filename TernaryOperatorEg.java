// Program to find largest number using Ternary Operators

class TernaryOperatorEg {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 20;
        int c = 15;
        int d = 8;
        
        //Nested ternary Operator to find large number

        int Result =(a>b) ? ( (a>c) ? (( a>d) ? a:d) :c):((b>c) ? ((b>d) ? b:d) :c);

        System.out.println("The large value is:" +Result);
    }
    
}

/*Output:
 * Complile Time Success
 * Run Time Sccess
 * The large value is:20
 */