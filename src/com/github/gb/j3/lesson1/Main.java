package com.github.gb.j3.lesson1;

import com.github.gb.j3.lesson1.swap.Swap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Swap:");
        String[] arr = new String[]{"str1", "str2", "str3"};
        print(arr);
        Swap.process(arr, 0, 2);
        print(arr);
    }

    private static <T> void print(T[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
