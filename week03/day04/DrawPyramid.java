package com.gfa.exam;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        System.out.println("Adj meg egy számot!");
        Scanner scanner = new Scanner(System.in);
        int numberOfRows = scanner.nextInt();

        for (int i = 0; i <= numberOfRows; i++) {
            for (int j = 0; j < numberOfRows-i; j++) {
            System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
           System.out.println();
        }
    }
}

// Írj egy programot, ami egy számot kér a standard input-ból és egy
// ilyen piramist rajzol:
//
//
//    *
//   ***
//  *****
// *******
//
// A piramisnak annyi sora legyen,
// mint amennyi az inputból kiolvasott szám értéke

