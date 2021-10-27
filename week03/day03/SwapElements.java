package com.greenfoxacademy.tombok;

public class SwapElements {
    public static void main(String[] args) {
     String[] orders = new String[]{"first", "second", "third"};

    String newString = orders[2] + " second " + orders[0];
    System.out.println(newString);
    }
}

// - Készíts egy `orders` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `["first", "second", "third"]`
// - Cseréld fel az első és a harmadik elemet az `orders` tömbben