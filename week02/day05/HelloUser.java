package com.greenfoxacademy.szkenner;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Módosítsd úgy ezt a programot, hogy a felhasználót üdvözölje
        // a Világ helyett.
        // A program kérje a felhasználó nevét
        System.out.println("Szia, mi a neved?");
        Scanner scanner = new Scanner(System.in);
        String nev = scanner.nextLine();
            System.out.println("Szia " + nev + "!");
    }
}
