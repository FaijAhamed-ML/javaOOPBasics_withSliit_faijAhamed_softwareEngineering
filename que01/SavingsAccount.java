package que01;

public class SavingsAccount {
    private int accountNumber;
    private String accHolderName;
    private double AccountBalance;

    public void setAccountNumber(int accNum) {
       this.accountNumber=accNum;
    }
    public void setAccountHolder(String accHolderName) {
        this.accHolderName=accHolderName;
    }
    public int GetAccountNumber() {
        return accountNumber;
    }
    public String GetAccountHolderName() {
        return accHolderName;
    }
    public double GetAccountBalance() {
        return AccountBalance;
    }

    public void deposit(double amount){
        if (amount>0){
            this.AccountBalance+=amount;
        }
    }
    public void withdraw(double amount){
        if (amount>0){
            this.AccountBalance-=amount;
        }
    }
    public void displayAccountDetails(){
        System.out.println("Account Number: "+this.accountNumber);
        System.out.println("Account Holder: "+this.accHolderName);
        System.out.println("Balance: "+this.AccountBalance);
    }

}
