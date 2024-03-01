class PreventFallThroughUsingArrow {
    public static void main(String[] args)
    {
        //using final we can create  fix value
        //Duplicate value are not allow plce of value
        // We can pass expression in place of value
        
        final int a=4;
        int dayNum=2;

        //(-> ) Using this symbol we can prevent fall through

         switch(dayNum)
         {
            case 1->System.out.println("Monday");
            case 2->System.out.println("Tuesday");
            case 3->System.out.println("Wednesday");
            case a->System.out.println("Thursday");
            case 5 ->System.out.println("Friday");
            case 6->System.out.println("Saturday");
            case 7->System.out.println("Sunday");

            default ->System.out.println("Invalid");

         }    
    }
}

/*OUTPUT:
compile time success
run time success
Tuesday
 */

    

