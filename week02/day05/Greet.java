package com.greenfoxacademy.functionmethods;

public class Greet {
    public static void main(String[] args) {
        String name = "Green Fox";
        greet(name);
    }
    public static void greet(String name) {
        System.out.println("Üdv, kedves " + name);
    }
}

// - Hozz létre egy class-t `Greet` névvel és benne a main függvényt.

// - Hozz létre egy `name` nevű String változót, aminek az értéke legyen `Green Fox`.

// - Készíts egy függvényt `greet` névvel mely üdvözli a bemeneti paraméterét kiírással(void & print)
//   pl.: `Üdv, kedves Green Fox`

// - greet(`name`)