public class ClassBankAccount 
{
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private double interestRate;
    
    public ClassBankAccount(int accountNumber, String accountHolderName, double balance, double interestRate) 
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    
    public void deposit(double amount) 
    {
        balance += amount;
    }
    
    public void withdraw(double amount) 
    {
        balance -= amount;
    }
    
    public double calculateInterest() 
    {
        return balance * interestRate;
    }
}