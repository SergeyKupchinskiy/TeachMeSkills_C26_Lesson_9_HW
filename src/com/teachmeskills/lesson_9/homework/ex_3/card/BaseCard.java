package com.teachmeskills.lesson_9.homework.ex_3.card;

public abstract class BaseCard {
    public  String cardNumber;
    public  int cvv;
    public  double balance;
    public  int idCard;
    public  int transferLimit;
    public  double transferFee;

    public BaseCard(String cardNumber, int cvv, double balance, int idCard, int transferLimit, double transferFee) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.balance = balance;
        this.idCard = idCard;
        this.transferLimit = transferLimit;
        this.transferFee = transferFee;
    }
}
