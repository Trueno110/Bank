package org.example;

public class BankCard implements Card{

    private int cardNumber;
    private int pinCode;
    private int cvv;

   public BankCard(int cardNumber,int pinCode,int cvv){
       this.cardNumber = cardNumber;
       this.pinCode = pinCode;
       this.cvv = cvv;
   }


    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public int getPinCode() {
        return 9090;
    }

    @Override
    public int getCvv() {
        return 0;
    }
}
