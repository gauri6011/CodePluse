
public class ReverseinRange {
    public static void main(String[] args) {
        int start=170;
        while(start<=200){
          int i=start;
          int reverse=0;
            while(i>0)
        {
              int r=i%10;
              reverse=(reverse*10)+r;
              i=i/10;     
        }
        System.out.println(reverse);
        start++;
    }
    
}
}
