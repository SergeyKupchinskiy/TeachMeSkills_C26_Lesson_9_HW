package com.teachmeskills.lesson_9.homework.ex_3.card;

public class VisaCard extends BaseCard{
    public VisaCard(String cardNumber, int cvv, double balance, int idCard, int transferLimit, double transferFee) {
        super(cardNumber, cvv, balance, idCard, transferLimit, transferFee);
    }
    public static int transferLimit = 4500;
    public static double transferFee = 0.089;
}
