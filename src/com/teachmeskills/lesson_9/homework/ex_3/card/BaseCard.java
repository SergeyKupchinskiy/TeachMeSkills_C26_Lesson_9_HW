package com.teachmeskills.lesson_9.homework.ex_3.card;

public abstract class BaseCard {
    private static int count = 0;

    private int id;
    private String cardNumber;
    private int cvc;
    private int amount;

    public BaseCard(String cardNumber, int amount) {
        this.id = count++;
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public abstract int commission ();
    public abstract boolean limitCheck(int amount);
}
