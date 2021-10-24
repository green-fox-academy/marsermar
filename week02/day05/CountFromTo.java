package com.greenfoxacademy.ciklusok;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

// Készíts egy programot, ami két számot kér
// Ha a második szám nem nagyobb, mint az első, írja ki:
// "A második számnak nagyobbnak kellene lennie!"
//
// Amennyiben nagyobb,
// az első számtól kezdve el kellene számolnia egyesével a másodikig
//
// Például:
//
// első szám: 3, második szám: 6, ezt kellene printelnie:
//
// 3
// 4
// 5
        System.out.println("Írj be egy számot!");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int number = Integer.parseInt(userInput);

        System.out.println("Írj be mégegy számot!");
        String userInput2 = scanner.nextLine();
        int number2 = Integer.parseInt(userInput2);

        if (number > number2) {
            System.out.println("A második számnak nagyobbnak kell lennie!");

        } else if (number < number2) {
            for (int i = number; i < number2; i++) {
                System.out.println(i);
            }
        }
    }
}
