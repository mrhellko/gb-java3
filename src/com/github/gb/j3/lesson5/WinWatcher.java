package com.github.gb.j3.lesson5;

class WinWatcher {
    private static boolean win = false;
    private static Car winner;
    static synchronized void setWinner(Car car) {
        if(!win) {
            winner = car;
            win = true;
            System.out.println(winner.getName() + " - WIN");
        }
    }
}
