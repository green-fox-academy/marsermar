package com.gfa.exam;

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        System.out.println("Adj meg egy számot!");
        Scanner scanner = new Scanner(System.in);

        int numberOfRows = scanner.nextInt();

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfRows; j++) {
                if (i == 0 || i == numberOfRows - 1 || j == 0 || j == numberOfRows - 1) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// Írj egy programot, ami egy számot kér a standard input-ból és egy
// ilyen négyzetet rajzol:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// A négyzetnek annyi sora legyen,
// mint amennyi az inputból kiolvasott szám értéke