package com.greenfoxacademy.tombok;

import java.util.stream.IntStream;

public class SumAll {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7};
        int sum = IntStream.of(numbers).sum();
        System.out.println(sum);
    }
}

// - Készíts egy `numbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[3, 4, 5, 6, 7]`
// - Írasd ki a konzolra a `numbers` tömb összes elemének összegét