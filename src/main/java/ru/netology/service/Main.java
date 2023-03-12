package ru.netology.service;

public class Main {
    public static void main(String[] args) {
        RestService service = new RestService();
        System.out.println(service.calculate(10_000, 3000, 20_000));
    }
}