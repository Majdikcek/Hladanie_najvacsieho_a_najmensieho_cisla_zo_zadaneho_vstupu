package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** PRINCÍP HRY ***");
        System.out.println("Hra pre dvoch hráčov, jeden z hráčov zadá hodnotu a druhý sa ju následne snaží uhádnuť, pričomž má na to 10 pokusov.");
        System.out.println("*** ŠTART ***");
        Scanner vstup = new Scanner(System.in);
        System.out.println("HRÁČ č.1:");
        System.out.println("Zadaj vstupnú hodnotu od 0 do 100.");
        int zadaj = vstup.nextInt();
        while (zadaj > 100) {
            System.out.println("Zadaj vstupnú hodnotu od 0 do 100.");
            zadaj = vstup.nextInt();
        }
        while (zadaj < 0) {
            System.out.println("Zadaj vstupnú hodnotu od 0 do 100.");
            zadaj = vstup.nextInt();
        }
        int pokus = 9;
        System.out.println("HRÁČ č.2:");
        System.out.println("Hádaj hodnotu od 0 do 100.");
        Scanner vystup = new Scanner(System.in);
        int hadaj = vystup.nextInt();
        while (zadaj != hadaj) {
            if (zadaj > hadaj) {
                System.out.println("Zadaj väčšiu hodnotu.");
                System.out.println("Počet pokusov: " + pokus);
                hadaj = vystup.nextInt();
                pokus = pokus - 1;
            }
            if (zadaj < hadaj) {
                System.out.println("Zadaj menšiu hodnotu.");
                System.out.println("Počet pokusov: " + pokus);
                hadaj = vystup.nextInt();
                pokus = pokus -1;
            }
            if (pokus == 0) {
                break;
            }
        }
        if (zadaj == hadaj) {
            System.out.println("Zadal si správnu hodnotu.");
            System.out.println("Vyhral si!");
        }
        else {
            System.out.println("Došli ti pokusy.");
            System.out.println("Prehral si!");
        }
        System.out.println("*** KONIEC HRY ***");
    }

}