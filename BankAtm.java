package org.example;

public class BankAtm implements ATM{
    private Card insertedCard;
    private int pinCodeAttempts;


    @Override
    public void insertCard(Card card) {
        insertedCard = card;
        pinCodeAttempts = 0;
    }

    @Override
    public void enterPinCode(int pinCode) {
        if (insertedCard != null && pinCode == insertedCard.getPinCode()){
            User user = getUserInfo(insertedCard);
            System.out.println("Здравствуйте, "+ user.getUserName());
            System.out.println("ID аккаунта, "+ user.getAccountid());
        }else {
            pinCodeAttempts++;
            if(pinCodeAttempts>=3){
                System.out.println("Карта заблокирована");
                insertedCard =null;
            }else{
                System.out.println("Неверный Пин-код.Осталось попыток: "+(3-pinCodeAttempts));
            }
        }
    }

    @Override
    public void requestBalance() {
        if (insertedCard!= null){
            User user = getUserInfo(insertedCard);
            System.out.println("Баланс: "+user.getAccountBalance());
        }else{
            System.out.println("Карта не считана");
        }
    }

    @Override
    public void deposit(double amount) {
        if(insertedCard != null){
            User user = getUserInfo(insertedCard);
            double newBalance = user.getAccountBalance()+amount;
            System.out.println("На депозите: "+amount+" в аккаунте.Новый баланс: "+newBalance);
        }else{
            System.out.println("Карта не считана");
        }
    }

    @Override
    public void withdraw(double amount) {
        if(insertedCard != null){
            User user = getUserInfo(insertedCard);
        if (amount <= user.getAccountBalance()){
            double newBalance = user.getAccountBalance()-amount;
            System.out.println("Извлечено "+ amount+" с аккаунта.Новый баланс: "+newBalance);
        }else{
            System.out.println("Недостаточно средств");
        }
        }else{
            System.out.println("Карта не считана");
        }
}
private User getUserInfo(Card card){
    return new BankUser("Ilya Fedorov",123456789,1000.0);
    }
}