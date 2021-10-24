package com.greenfoxacademy.conditionals;

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Írj egy programot, ami két számot kér a standard input-ból
        // Az első szám a lányok száma, akik jönnek a buliba
        // A második szám a fiúk száma
        //
        // Ha több, mint 20 ember eljön és a lányok és fiúk száma egyenlő
        // Írja ki, hogy: Ez a buli kitűnő!
        //
        // Ha több, mint 20 ember eljön, de a lányok - fiúk arány nem egyenlő
        // Írja ki, hogy: Ez a buli egész jó!
        //
        // Ha kevesebb, mint 20 ember jön el
        // Írja ki, hogy: Átlagos buli...
        //
        // Ha egy lány sem jön el, függetlenül az emberek számától
        // Írja ki, hogy: Virsli party

        System.out.println("Add meg a lányok számát!");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int numberOfGirls = Integer.parseInt(userInput);

        System.out.println("Add meg a fiúk számát!");
        String userInput2 = scanner.nextLine();
        int numberOfBoys = Integer.parseInt(userInput2);

        int sumOfGirlsAndBoys = numberOfGirls + numberOfBoys;

        if (sumOfGirlsAndBoys > 20 && numberOfGirls == numberOfBoys) {
            System.out.println("Ez a buli kitűnő!");
        } else if (sumOfGirlsAndBoys > 20 && numberOfGirls != 0) {
            System.out.println("Ez a buli egész jó!");
        } else if (sumOfGirlsAndBoys < 20 && numberOfGirls != 0) {
            System.out.println("Átlagos buli...");
        } else if (numberOfGirls == 0) {
           System.out.println("Virsli party");
        }
    }
}

