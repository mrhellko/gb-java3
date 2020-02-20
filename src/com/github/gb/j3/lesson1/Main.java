package com.github.gb.j3.lesson1;

import com.github.gb.j3.lesson1.task.Apple;
import com.github.gb.j3.lesson1.task.Box;
import com.github.gb.j3.lesson1.task.Orange;
import com.github.gb.j3.lesson1.utils.Swap;
import com.github.gb.j3.lesson1.utils.ToList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Swap:");
        String[] arr = new String[]{"str1", "str2", "str3"};
        print(arr);
        Swap.process(arr, 0, 2);
        print(arr);

        System.out.println("To ArrayList:");
        ArrayList<String> list = ToList.toArrayList(arr);
        System.out.println(list);

        System.out.println("Big task");
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();
        Orange o1 = new Orange();
        Orange o2 = new Orange();
        Orange o3 = new Orange();
        Box<Apple> appleBox = new Box<>();
        appleBox.put(a1, a2, a3);
        Box<Orange> orangeBox = new Box<>();
        orangeBox.put(o1, o2);
        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.put(o1, o2, o3);
        System.out.println("Apple box weight: " + appleBox.getWeight());
        System.out.println("Orange box weight: " + orangeBox.getWeight());
        System.out.println("Orange box 2 weight: " + orangeBox2.getWeight());
        System.out.println("Apple box compare Orange box: " + appleBox.compare(orangeBox));
        System.out.println("Orange box compare Orange box 2: " + orangeBox.compare(orangeBox2));
        System.out.println("Orange box 2 -> Orange box");
        orangeBox.putAll(orangeBox2);
        System.out.println("Orange box weight: " + orangeBox.getWeight());
        System.out.println("Orange box 2 weight: " + orangeBox2.getWeight());
        //appleBox.putAll(orangeBox); //Ошибка
    }

    private static <T> void print(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
