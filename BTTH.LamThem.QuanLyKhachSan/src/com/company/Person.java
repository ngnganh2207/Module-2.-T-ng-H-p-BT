package com.company;

public class Person {
    private String name;
    private String date;
    private String identity;

    public Person() {
    }
    public Person(String name, String date, String identity) {
        this.name = name;
        this.date = date;
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", identity='" + identity + '\'' +
                '}';
    }
}
