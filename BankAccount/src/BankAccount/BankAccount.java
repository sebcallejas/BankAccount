package BankAccount;
/*
* Sebastian Callejas
* Period 2
* Project: BankAccount
*/

/**
 *
 * @author 18051
 */
public class BankAccount {
//Lets get it done
    private double balance;
    private double deposit;
    private double withdraw;
    private double calcInterest;
    
    public BankAccount (){
        balance = 0.0;
    }
    
    public BankAccount(double pBalance){
        balance = pBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void setBlanace( double pBalance){
        balance = pBalance;
    }
    public void deposit(double pAmount){
        balance += pAmount;
    }
    public void withdraw(double pAmount){
        if (pAmount <= balance) {
         balance -= pAmount;   
        }
    }
    public void calcInterest(double interest){
        balance += balance * interest/100;
    }
    
}
