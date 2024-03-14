public class DuckNum {
    public static void main(String[] args) {
        int n=88;
        while(n>0){
            int r=n%10;
            if(r==0){
                System.out.println("Duck number");
                break;
            }
            n=n/10;
        }
        if(n==0){
            System.out.println("Not duck number");
        }
    }
}

/*output:
compile time success
run time success
Not duck number
*/
