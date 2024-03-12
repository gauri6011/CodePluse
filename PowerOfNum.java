public class PowerOfNum {
    public static void main(String[] args) {
        int base=5;
        int power=5;
        int ans=1;
        for(int i=1; i<=power;i++){
            ans=ans*base;
        }
        System.out.println(ans);
    }
}
/*
compile time success
run time success
3125
 */
