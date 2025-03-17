package ru.netology.service;

public class CustomsService {
    private static final int TARIFF_WEIGHT = 100;

    public static int calculateCustoms(int price, int weight) {
        return (price / 100) + (weight * TARIFF_WEIGHT);
    }
}
