class CheckAgeUsingTernaryOp {
    public static void main(String[] args) {
        int k=21;
        int d=88;
        int r=90;
        int s=20;
        
        int Result= (k>d) ? ((k>r)? ((k>s) ? (k):(s)) :(r>s ? (r) :(s))):(d>r ? ((d>s)? (d): (s)):(r>s)?(r):(s));
        System.out.println("Result :" +Result);
    } 
}

/*output:
 Compile time success
 Run time success
 Result :90
 */
