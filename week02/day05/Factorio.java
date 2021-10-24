package com.greenfoxacademy.functionmethods;

public class Factorio {
    public static void main(String[] args) {
        int numbers = 5;
        for(int i = 1; i < 5; i++) {
            numbers = numbers*i;
        }
        System.out.println(numbers);
    }
}


// - Hozz létre egy class-t `Factorio` névvel és benne a main függvényt.

// - Készíts egy függvényt `factorio` névvel,
//   mely visszaadja a bemeneti paraméter faktoriális értékét.