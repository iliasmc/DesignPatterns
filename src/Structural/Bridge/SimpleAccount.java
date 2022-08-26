package Structural.Bridge;

public class SimpleAccount extends BankAccount{

    private double balance;

    public SimpleAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double sum){
        balance += sum;
    }

    public boolean withdraw(double sum){
        if(balance - sum < 0){
            return false;
        }else{
            balance -= sum;
            return true;
        }
    }

}
