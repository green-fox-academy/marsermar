package com.greenfoxacademy.types;

public class CodingHours {
    public static void main(String[] args) {
        // Egy átlagos Green Fox hallgató 6 órát kódol naponta
        // Egy félév hosszúsága 17 hét

        // Írd ki, hány órát tölt kódolással egy hallgató egy félév során,
        // ha a hallgató csak hétköznap kódol

        // Írd ki, hogy a félév hány százalékát tölti a hallgató kódolással
        // ha az átlagos heti munkaidő 52 óra

        int CodingPerDay = 6;
        int WeeksOfHalfYear = 17;
        int Workdays = 5;

        int CodingPerWeek = CodingPerDay * Workdays;
            System.out.println(CodingPerWeek + " órát tölt kódolással egy héten egy átlagos Green Fox hallgató.");
            System.out.println(CodingPerWeek * WeeksOfHalfYear + " órát tölt kódolással egy hallgató egy félév során.");

        int AverageWorkingHours = 52;
        double percent = (CodingPerWeek * 100) / AverageWorkingHours;
            System.out.print(percent);

            System.out.println("%-át tölti kódolással a félévnek egy hallgató.");
    }
}
