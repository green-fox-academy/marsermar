package com.gfa.exam;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(0, 10));
    }
    public static int sum (int number1, int number2) {
        int sum = 0;
        for (int i = number1; i <= number2; i++) {
            sum += i;
        }
        return(sum);
    }
}

//'use strict';
// - Írj egy `sum` nevű függvényt, ami visszaadja (return) az egész számok
//   összegét  nullától a megadott paraméterig