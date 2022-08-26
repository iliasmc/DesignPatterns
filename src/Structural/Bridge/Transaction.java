package Structural.Bridge;

public interface Transaction {

    void detectFraudOnAccount(String IBAN);

    void makeTransaction(String originIBAN, String targetIBAN, double sum);

}
