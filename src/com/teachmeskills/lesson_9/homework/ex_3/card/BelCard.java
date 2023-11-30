package com.teachmeskills.lesson_9.homework.ex_3.card;

public class BelCard extends BaseCard{
    public BelCard(String cardNumber, int cvv, double balance, int idCard, int transferLimit, double transferFee) {
        super(cardNumber, cvv, balance, idCard, transferLimit, transferFee);
    }
    public static int transferLimit = 100000;
    public static double transferFee = 0.053;
}
