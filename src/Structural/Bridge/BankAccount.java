package Structural.Bridge;

abstract public class BankAccount {

    private Transaction imp;

    public void setTransactionAuthenticator(Transaction imp){
        this.imp = imp;
    }

    void transfer(String originIBAN, String targetIBAN, double sum){
        imp.detectFraudOnAccount(originIBAN);
        imp.makeTransaction(originIBAN, targetIBAN, sum);
    }

}
