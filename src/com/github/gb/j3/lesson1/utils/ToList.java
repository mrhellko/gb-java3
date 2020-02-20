package com.github.gb.j3.lesson1.utils;

import java.util.ArrayList;

public class ToList {
    public static <T> ArrayList<T> toArrayList(T[] arr) {
        ArrayList<T> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
