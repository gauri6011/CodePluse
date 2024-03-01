 class ExampleNested_If {
    public static void main(String[] args) {
        int Age=22;
        if(Age>5)
        {
            if(Age>10)
            {
                if(Age>15)
                {
                    if(Age>18)
                    {
                     System.out.println("Congrats"); 
                    } 
                }    
             }

        }
    }
}

/*OutPut:
 * compile time success
 * run time success
 * Congrats
 */
