package com.teachmeskills.lesson_9.homework.ex_3.card.impl;

import com.teachmeskills.lesson_9.homework.ex_3.card.BaseCard;

public class MasterCard extends BaseCard {

    public MasterCard(String cardNumber, int amount) {
        super(cardNumber, amount);
    }

    private static final int COMMISSION_MASTERCARD = 10;
    public static final int TRANSFER_LIMIT_BELCARD = 1000;

    @Override
    public int commission() {
        return COMMISSION_MASTERCARD;
    }

    @Override
    public boolean limitCheck(int amount) {
        if (getAmount() - amount < TRANSFER_LIMIT_BELCARD) {
            return false;
        }
        return true;
    }
}