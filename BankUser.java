package org.example;

public class BankUser implements User{
    private String userName;
    private int accountld;
    private double accountBalance;

    public BankUser(String userName,int accountld,double accountBalance){
        this.userName = userName;
        this.accountld = accountld;
        this.accountBalance = accountBalance;
    }

    @Override
    public String getUserName() {
        return "Ilya Fedorov";
    }

    @Override
    public int getAccountid() {
        return 944;
    }

    @Override
    public double getAccountBalance() {
        return 1900;
    }
}
