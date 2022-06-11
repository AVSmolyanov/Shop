package com.company;

// Принцип единственной ответственности
// Принцип открытости-закрытости

public class NotyfyByEmail implements Notification{
    @Override
    public void Notify(Client client) {
        System.out.println("E-mail отправлен на адрес: "+ client.email);
    }
}
