package com.teachmeskills.lesson_9.homework.ex_3.client;

import com.teachmeskills.lesson_9.homework.ex_3.card.BaseCard;
import com.teachmeskills.lesson_9.homework.ex_3.card.BelCard;
import com.teachmeskills.lesson_9.homework.ex_3.card.MasterCard;
import com.teachmeskills.lesson_9.homework.ex_3.card.VisaCard;

public class Client {
    public String name;
    public String surname;
    public String passportNumber;
    public String dateOfBirth;
    public int postCode;
    public String country;
    public String city;
    public String street;
    public int houseNumber;
    public int apartmentNumber;

    public Client(String name, String surname, String passportNumber, String dateOfBirth,
                  int postCode, String country, String city, String street, int houseNumber, int apartmentNumber) {
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
        this.dateOfBirth = dateOfBirth;
        this.postCode = postCode;
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }
    public static Client client1 = new Client("Tom","Hardy","BL066001","15.09.1977",
            640330,"Great Britain","London","Baker street",221,2);
    BaseCard belCardClient1 = new BelCard("4300 2360 4453 5656",419,31009.8,0,BelCard.transferLimit,BelCard.transferFee);
    BaseCard masterCardClient1 = new MasterCard("7890 6660 7877 9000",420,14057.6,1,MasterCard.transferLimit,MasterCard.transferFee);
    BaseCard visaCardClient1 = new VisaCard("3232 4103 8887 5454",803,8033.6,2,VisaCard.transferLimit,VisaCard.transferFee);

    public static BaseCard[] allCards = new BaseCard[]{client1.belCardClient1, client1.masterCardClient1, client1.visaCardClient1};
}
