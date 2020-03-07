package com.github.gb.j3.lesson5;

import java.util.concurrent.*;

public class MainClass {
    public static final int CARS_COUNT = 4;
    public static void main(String[] args) {
        CountDownLatch cdlStart = new CountDownLatch(CARS_COUNT);
        CountDownLatch cdlFinish = new CountDownLatch(CARS_COUNT);
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 30 + (int) (Math.random() * 20), cdlStart, cdlFinish);
        }
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }

        new Thread(() -> {
            while (cdlStart.getCount() > 0);
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        }).start();

        new Thread(() -> {
            while(cdlFinish.getCount() > 0);
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
        }).start();

    }
}