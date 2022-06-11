package com.company;

import java.util.Scanner;

public class Main {

// Избегание магических чисел
    final static Integer maxNumberOfOperations = 2;
// Принцип инверсии зависимостей
    Notification notify = new NotyfyByEmail();

    public static void help(){
// Принцип DRY
        final String TXT = "Выберите операцию и введите её номер:\n" +
                "1. Вывести список товаров\n" +
                "2. Купить\n";
        System.out.println(TXT);
    }
    public static String inpData(final String txt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(txt);
        return scanner.next();
    }

    public static void main(String[] args) {
        help();
        Scanner scanner = new Scanner(System.in);
        int operation = 0;
        while (operation<maxNumberOfOperations) {
            operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("Список товаров");
                    //todo Реализовать вывод списка товаров
                    break;
                case 2:
                    //todo Реализовать процесс покупки
                    System.out.println("Функция в разработке...");
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
        System.out.println("Программа завершена!");
    }
}
