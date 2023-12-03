package com.teachmeskills.lesson_9.homework.ex_3.client;

import com.teachmeskills.lesson_9.homework.ex_3.card.BaseCard;

import java.util.Date;

public class Client {
    
    private String name;
    private String surname;
    private String passportNumber;
    private String birthDate;
    private Address address;
    private BaseCard[] cards;

    public Client(String name, String surname, String passportNumber, String birthDate, Address address, BaseCard[] cards) {
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
        this.birthDate = birthDate;
        this.address = address;
        this.cards = cards;
    }

    public BaseCard getCard(int id) {
        int count = -1;
        for(BaseCard baseCard: cards){
            count++;
            if (baseCard.getId() == id) {
                break;
            }
        }
        return cards[count];
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BaseCard[] getCards() {
        return cards;
    }

    public void setCards(BaseCard[] cards) {
        this.cards = cards;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    @Override
    public String toString() {
        return name + " " + surname;
    }
}
