 class BloodDonation {
    public static void main(String[] args) {
        int Hemoglobin=13;
        int Age=25;
        boolean Disease=false;
        boolean DrugsAddict=false;
        if (Age>18 && Age<=60)
        {
            if(Hemoglobin>=13)
            {
                if(Disease==false)
                {
                    if(DrugsAddict==false)
                    {
                        System.out.println("You are eligible for blood donation");
                    }
                    else
                    {
                        System.out.println("You can not donate blood because you are druge addict");
                    }
                }
                    else
                    {
                        System.out.println("You can not donate because you have cold");
                    }
                }
                else
                {
                    System.out.println("You can not donate because your hemoglobin less than 13");
                }

            }

        }
    }

    /*OutPut:
     * compile time success
     * run time success
     * You are eligible for blood donation
     */
    

