import java.util.*;
class Static_Block{
	static{
	       Scanner sc =new Scanner(System.in);
	       System.out.println("Enter the number:  ");
	       int num=sc.nextInt();
	       evenOdd(num);

	       System.exit(0);
	}
	public static void evenOdd(int num){
	    if(num%2==0){
	    System.out.println("EVEN");
	    }else{
	      System.out.println("ODD");
	    }
	}

}