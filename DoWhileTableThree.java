 class DoWhileTableThree {
    public static void main(String[] args) {
        int a=1;
        do{
            int b=a*3;
            // Print only even numbers
            if(b%2==0){
                System.out.println(b);
            }      
            a++;

        }while(a<=10);
    }
    
}

/*
output:
comple time success
run time success
6
12
18
24
30
 */
