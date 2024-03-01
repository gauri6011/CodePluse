 class GradeUsingIf_Else {
    public static void main(String[] args)
    {
        int Marks=100;
        if(Marks>=80 && Marks<=100)
        {
            System.out.println("A+");
        }
        else if(Marks>=60 && Marks<80)
        {
            System.out.println("B+");
        }
        else if(Marks>=40 && Marks<60)
        {
            System.out.println("c+");
        }
        else if(Marks>=35 && Marks<40)
        {
            System.out.println("E");
        }
        else{
            System.out.println("Fail");
        }
        
    }
    
}

/*OutPut:
 * comile time success
 * runtime success
 * A+
 */