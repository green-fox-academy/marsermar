package com.greenfoxacademy.functionmethods;

public class AppendAFunc {
    public static void main(String[] args) {
        String typo = "Chinchill";
        System.out.println(AppendAFunc(typo));
    }
    public static String AppendAFunc(String typo) {
        return typo + "a";
    }
}

// - Hozz létre egy class-t `AppendAFunc` névvel és benne a main függvényt.

// - Hozz létre egy `typo` nevű String változót, aminek az értéke legyen `Chinchill`.
// - Készíts egy függvényt `appendAFunc` névvel mely hozzácsatol egy 'a'
//   karaktert a függvény bemeneti paraméteréhez és String-ként adja vissza(return).

// - Írasd ki a visszatérési értékét a `appendAFunc(typo)` függvénynek.