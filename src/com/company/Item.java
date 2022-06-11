package com.company;

public class Item {
    protected static Integer nextId = 0;
    protected Integer id;
    protected String name;
    protected String description;
    protected Integer price;

    public Item(String name, String description, Integer price) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}

