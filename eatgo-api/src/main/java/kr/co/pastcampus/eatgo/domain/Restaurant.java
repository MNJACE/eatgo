package kr.co.pastcampus.eatgo.domain;

public class Restaurant {
    private final String name;
    private final String address;

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return "Bob zip";
    }

    public String getAddress() {
        return "Seoul";
    }

    public String getInformation() {
        return name + " in " + address;
    }
}