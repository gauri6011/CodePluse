 class DivisiblebyEleven
{
   public static void main(String[] args) {
   int n=100; 
do{
    if(n%11==0){
        System.out.println(n);
        
    }
   n++;
}while( n>100 && n<=200);

   } 
}
/*
Compile Time Successful
Run Time Successful
110
121
132
143
154
165
176
187
198
 */
