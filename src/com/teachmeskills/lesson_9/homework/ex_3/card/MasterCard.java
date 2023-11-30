package com.teachmeskills.lesson_9.homework.ex_3.card;

public class MasterCard extends BaseCard{
    public MasterCard(String cardNumber, int cvv, double balance, int idCard, int transferLimit, double transferFee) {
        super(cardNumber, cvv, balance, idCard, transferLimit, transferFee);
    }
    public static int transferLimit = 5000;
    public static double transferFee = 0.11;
}
