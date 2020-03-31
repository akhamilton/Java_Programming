public class TestDefinedException {
   public static void main(String[] args) {
      
      Account acct = new Account();
      System.out.println("Your Balance: "+acct.balance());
      
      try {
          acct.withdraw(400);
      } 
      catch (NotSufficientFundException e) {
         System.out.println(e.getMessage());
      }

      System.out.println("Your Balance: "+acct.balance());
      acct.deposit(300);
      System.out.println("Your Balance: "+acct.balance());
      
      try {
         acct.withdraw(1000);
      }
      catch (NotSufficientFundException e) {
         e.printStackTrace();
      }
   }
}
