package com.teachmeskills.lesson_9.homework.ex_3.client;

public class Address {

    private String postIndex;
    private int countryCode;
    private String city;
    private String streetName;

    public Address(String postIndex, int countryCode, String city, String streetName) {
        this.postIndex = postIndex;
        this.countryCode = countryCode;
        this.city = city;
        this.streetName = streetName;
    }

    public String getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(String postIndex) {
        this.postIndex = postIndex;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}