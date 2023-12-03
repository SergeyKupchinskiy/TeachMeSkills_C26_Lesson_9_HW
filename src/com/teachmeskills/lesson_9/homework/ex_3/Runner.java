package com.teachmeskills.lesson_9.homework.ex_3;


import com.teachmeskills.lesson_9.homework.ex_3.card.BaseCard;
import com.teachmeskills.lesson_9.homework.ex_3.card.impl.BelCard;
import com.teachmeskills.lesson_9.homework.ex_3.card.impl.MasterCard;
import com.teachmeskills.lesson_9.homework.ex_3.card.impl.VisaCard;
import com.teachmeskills.lesson_9.homework.ex_3.client.Address;
import com.teachmeskills.lesson_9.homework.ex_3.client.Client;
import com.teachmeskills.lesson_9.homework.ex_3.transferService.CardTransferService;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Start");

        BaseCard card1 = new VisaCard("1111-5678-9101-9991", 5000);
        BaseCard card2 = new BelCard("2222-2222-3333-4545", 20000);
        BaseCard card3 = new MasterCard("3333-3232-8989-0000",8000);

        BaseCard[] cards = new BaseCard[]{card1, card2, card3};

        Address address = new Address("630224", 44, "London", "Baker street");

        Client tom = new Client("Tom", "Hardy", "EN654770", "15.09.1977" , address, cards );
        System.out.println("Choose ID of the bank card: \n 0. Visa card \n 1. Bel card \n 3. Master card");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the card ID from which you want to make a transfer");
        BaseCard cardFrom = tom.getCard(scanner.nextInt());

        System.out.println("Enter the ID of the card to which you want to make a transfer");
        BaseCard cardTo = tom.getCard(scanner.nextInt());

        System.out.println("Enter the amount of the desired transfer");
        int amountToTransfer = scanner.nextInt();

        System.out.println(tom);
        CardTransferService.doTransfer(cardFrom, cardTo, amountToTransfer);
        System.out.println("End");
    }

}