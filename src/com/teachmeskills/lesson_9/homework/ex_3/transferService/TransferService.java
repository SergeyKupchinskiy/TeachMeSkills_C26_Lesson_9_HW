package com.teachmeskills.lesson_9.homework.ex_3.transferService;

import com.teachmeskills.lesson_9.homework.ex_3.client.Client;

public class TransferService {
    public static void transferMoney(int idCard1, int idCard2, double transferSum){
        if (idCard1 > Client.allCards.length || idCard1 < 0 ){
            System.out.println("Card ID entered incorrectly.");
        }
        else if (idCard2 > Client.allCards.length || idCard2 < 0 ) {
            System.out.println("Card ID entered incorrectly.");
        }
        else if (transferSum < 0) {
            System.out.println("The transfer amount was entered incorrectly. The transfer amount cannot be negative.");
        }
        else if (transferSum > Client.allCards[idCard1].transferLimit){
            System.out.println("You have exceeded the limit, transfer is not possible.");
        }
        else if (Client.allCards[idCard1].balance - transferSum < 0) {
            System.out.println("There are not enough funds to transfer on the above card.");
        }
        else if (Client.allCards[idCard1].balance - transferSum - (Client.allCards[idCard1].balance * Client.allCards[idCard1].transferFee )  < 0){
            System.out.println("There are not enough funds to transfer on the above card.");
        }
        else {
            System.out.println(Client.client1.name + " " + Client.client1.surname + "\n"
                    + "Number of customer cards: " + Client.allCards.length + "\n"
                    + "Card 1 balance before transfer: " + Client.allCards[idCard1].balance);
            Client.allCards[idCard1].balance = Client.allCards[idCard1].balance -  transferSum - (transferSum * Client.allCards[idCard1].transferFee );
            System.out.println("Card 1 balance after transfer: " + Client.allCards[idCard1].balance + "\n"
                    + "Card 2 balance before transfer: " + Client.allCards[idCard2].balance);
            Client.allCards[idCard2].balance = Client.allCards[idCard2].balance + transferSum;
            System.out.println("Card 2 balance after transfer: " + Client.allCards[idCard2].balance + "\n"
                    + "The transfer fee: " + transferSum * Client.allCards[idCard1].transferFee);
        }
    }
}
