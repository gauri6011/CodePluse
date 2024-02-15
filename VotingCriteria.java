public class VotingCriteria {
    public static void main(String[] args) {
        int Age=21;
        //voting criteria age>=18
        String Result = Age>=18 ? ("Congrats you can vote"):("Sorry you can not vote");
        System.out.println(Result);
    } 
}

/*output:
  compile time success
  run time success
  Congrats you can vote
 */
