package com.greenfoxacademy.variables;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Írj egy programot, ami kiszámítja, hogy hány másodperc
        // van még hátra a napból úgy, hogy az aktuális időt a fenti változókkal
        // lehet beállítani (a végeredmény is legyen egész szám)

        int totalCurrentSeconds = (currentHours * 60 * 60 + currentMinutes * 60);
            System.out.println("Eltelt másodpercek a napból: " + totalCurrentSeconds);
        int oneMinute = 60;
        int oneHour = 60;
        int oneDay = 24;

        int totalSecondsOfDay = (oneDay * oneHour * oneMinute);
            System.out.println("Másodpercek száma egy napban: " + totalSecondsOfDay);

        int remainedSeconds = (totalSecondsOfDay - totalCurrentSeconds);
            System.out.println("A napból hátralévő másodpercek száma: " + remainedSeconds);
    }
}
