package com.greenfoxacademy.functionmethods;

public class Doubling {
    public static void main(String[] args) {

       int baseNum = 123;
       int number2 = 2;
       System.out.println(doubling(baseNum, number2));
    }
    public static int doubling(int baseNum, int number2) {
        return baseNum * number2;
    }
}

// - Hozz létre egy `baseNum` nevű integer változót, aminek az értéke legyen `123`.

// - Készíts egy függvényt `doubling` névvel, mely megduplázza a függvény
//   bemeneti paraméterét és integer-ként adja vissza(return).

// - Írasd ki a visszatérési értékét a `doubling(baseNum)` függvénynek.