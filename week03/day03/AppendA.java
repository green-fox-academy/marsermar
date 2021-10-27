package com.greenfoxacademy.tombok;

public class AppendA {
    public static void main(String[] args) {
      String[] animals = new String[] {"koal", "pand", "zebr"};
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i] + "a");
        }
    }
}

// - Készíts egy `animals` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `["koal", "pand", "zebr"]`
// - Minden elemhez csatolj egy "a" betűt a szó végére