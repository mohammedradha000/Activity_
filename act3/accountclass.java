package act3;
public class accountclass {
    
    private int accountNumber;
    private double Balance;
    
     public void setaccountNumber(int accountnumber) {
        accountNumber = accountnumber;
    }

    public int getaccountNumber() {
        return accountNumber;
    }
    
    
   public void setBalance(double balance) {
        Balance = balance;
    }

    public double getBalance() {
        return Balance;
    } 
     public void debit(double Debit){
         
     Balance=getBalance()-Debit;     
             }
     
    
}
