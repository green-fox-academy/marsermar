package com.greenfoxacademy.conditionals;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Írj egy programot ami beolvas egy számot a standard input-ból (scanner),
        // majd kiírja, hogy "Páros", ha páros és
        // kiírja, hogy "Páratlan", ha páratlan.

        System.out.println("Írj be egy számot!");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int number = Integer.parseInt(userInput);
        if (number % 2 == 0) {
            System.out.println("Páros");
        } else {
            System.out.println("Páratlan");
        }
    }
}

