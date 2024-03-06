class DoWhileDigitPrint 
{
    public static void main(String[] args) {

        // print digit of given number
        int a=2345;
        do{
            int r=a%10;
            System.out.println(r);
            a=a/10;
        }while(a>0);
    }
}

/*output:
comple time success
run time success
5
4
3
2
*/