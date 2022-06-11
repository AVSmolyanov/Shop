package com.company;

// Принцип замены Барбары Лисков
public class Client extends Customer{
    public String email;

    public Client(String name, String notes, String email) {
        super(name, notes);
        this.email = email;
    }

}
