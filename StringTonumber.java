import java.util.Scanner;

class StringTonumber
{
   public static void main(String[] args)
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the string : ");
   String str=sc.next().toUpperCase();

   int op=0;
   for(int i=0; i<str.length(); i++) 
   { 
     char ch=str.charAt(i);
     if(i==0){
         op=ch-64;
     }else{
         op=op*26+(ch-64);
     }
     System.out.println(str+" : "+op);

   }
   }

	
}