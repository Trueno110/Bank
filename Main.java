package org.example;

public class Main {
    public static void main(String[] args) {

        Card card = new BankCard(466098,9090,544);
        ATM atm = new BankAtm();
        atm.insertCard(card);
        atm.enterPinCode(9090);
        atm.requestBalance();
        atm.deposit(500);
        atm.withdraw(300);


    }
}