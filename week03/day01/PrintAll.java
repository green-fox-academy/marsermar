package com.greenfoxacademy.tombok;

public class PrintAll {
    public static void main(String[] args) {
    int[] numbers = {4, 5, 6, 7};

    for (int i : numbers)
        System.out.println(i);
    }
}

// - Készíts egy `numbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[4, 5, 6, 7]`
// - Írasd ki a konzolra a `numbers` nevű tömb összes elemét