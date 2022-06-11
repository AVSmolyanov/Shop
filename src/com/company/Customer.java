package com.company;

public class Customer {
    private static Integer maxId = 0;
    public Integer id;
    public String name;
    public String notes;

    public Customer(String name,String notes) {
        maxId = maxId + 1;
        this.name = name;
        this.notes = notes;
        this.id = maxId;
    }

    public Integer getId() {
       return id;
    }

}
