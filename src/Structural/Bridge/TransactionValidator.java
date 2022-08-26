package Structural.Bridge;

import java.util.HashSet;

public class TransactionValidator implements Transaction {

    private HashSet<String> suspiciousAccounts;

    public TransactionValidator(HashSet<String> suspiciousAccounts) {
        this.suspiciousAccounts = suspiciousAccounts;
    }

    @Override
    public void detectFraudOnAccount(String IBAN) {
        if(suspiciousAccounts.contains(IBAN)){
            System.out.println("Suspicious account, intercepted transaction");
        }
    }

    @Override
    public void makeTransaction(String originIBAN, String targetIBAN, double sum) {
        System.out.printf("Money send from origin to target");
    }


}
