package com.teachmeskills.lesson_9.homework.ex_3;

import com.teachmeskills.lesson_9.homework.ex_3.transferService.TransferService;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the id of the card from which you are going to make a money transfer: ");
        int idCard1 = scanner.nextInt();

        System.out.println("Enter the id of the card to which you are going to make a money transfer: ");
        int idCard2 = scanner.nextInt();

        System.out.println("Enter the transfer amount");
        double transferSum = scanner.nextInt();
        TransferService.transferMoney(idCard1, idCard2, transferSum);
    }
}
