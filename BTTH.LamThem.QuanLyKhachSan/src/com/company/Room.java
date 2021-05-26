package com.company;

public class Room {
    private int day;
    private String type;
    private int price;
    private Person customer= new Person();

    public Room() {
    }

    public Room(int day, String type, int price, Person customer) {
        this.day = day;
        this.type = type;
        this.price = price;
        this.customer = customer;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Room{" +
                "day=" + day +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", customer=" + customer +
                '}';
    }
}
