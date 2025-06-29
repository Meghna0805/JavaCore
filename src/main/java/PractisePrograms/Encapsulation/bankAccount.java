package PractisePrograms.Encapsulation;

public class bankAccount {

    private String accountNo;
    private double balance;

    public void deposit(double amount) {
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Deposited " + amount + " to " + accountNo);
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }
    public void withdraw(double amount) {
        if(amount>0 && amount<=balance){
            balance = balance - amount;
            System.out.println("Withdrawn " + amount + " from " + accountNo);
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
}
