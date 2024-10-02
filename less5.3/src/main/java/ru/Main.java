package ru;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setMoneyAmount(1000); // передайте в банкомат сумму на счету
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
        bankAccount.takeOff();
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
    }
}
class BankAccount {
    private long moneyAmount;
    public long getMoneyAmount(){
        return moneyAmount;
    }
    public void setMoneyAmount(long newMoneyAmount){
        this.moneyAmount=newMoneyAmount;
    }
    public void takeOff(){
        System.out.println("Со счета снято "+ moneyAmount + " р.");
        moneyAmount=0;
    }
}