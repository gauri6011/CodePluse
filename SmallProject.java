import java.util.Scanner;
public class SmallProject
 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Your Choice");
        int key1=sc.nextInt();
        switch(key1){
            case 1:
            {
                System.out.println("Choose the College: ");
                System.out.println("Enter Your Choice:");
                int key2=sc.nextInt();
                switch(key1)
                {
                    case 1:
                    {
                        System.out.println(   " Place Of College:");
                        System.out.println("Enter Your Grade:");
                        String grade=sc.next();
                        System.out.println("Enter Your Percentages:");
                        float per=sc.nextFloat();

                        System.out.println("Enter Your Choice:");
                        int key3=sc.nextInt();
                         switch(key2)
                         {
                            case 1:
                            {
                                if(per>=70 || grade=="A")
                                {
                                    System.out.println("Congrats you  Get College in your native");
                                }
                                else
                                {
                                    System.out.println("Sorry You Cannot Get College in Your Native ");
                                }
                            }
                            break;
                            case 2:
                            {
                                if(per>=60 || grade=="B" || grade=="B")
                                {
                                    System.out.println("Congrats you Get College In India ");

                                }
                                else
                                {
                                    System.out.println("Sorry You Cannot Get College In India ");
                                }
                            }
                            break;
                            case 3:
                            {
                                if(per>=90 || grade=="A" )
                                {
                                    System.out.println("Congrats you  Get College In the World ");
                                }
                                else
                                
                                {
                                    System.out.println(" Sorry You Cannot Get College In the World ");
                                }
                            }
                            break;
                            case 4:
                            {
                                if(per>=35 || grade=="C" )
                                {
                                    System.out.println("Congrats you  Get College In Remote area");
                                }
                                else
                                {
                                    System.out.println(" Sorry You Cannot Get College In Remote area");
                                }
                            }
                            break;

                         }


                    }
                }
            }
        } 
    }
}


 /*output:
compile time success
run time success
 Enter Your Choice
1
Choose the College:
Enter Your Choice:
1
 Place Of College:
Enter Your Grade:
1
Enter Your Percentages:
90
Enter Your Choice:
1
Congrats you  Get College in your native
     */
    
