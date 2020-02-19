package com.github.gb.j3.lesson1.task;

public class Apple extends Fruit {
    public Apple() {
        setWeight(1.0);
    }

    @Override
    public String toString() {
        return super.toString() + ": i am apple";
    }
}
