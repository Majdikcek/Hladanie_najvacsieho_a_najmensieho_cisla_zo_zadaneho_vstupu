package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
        System.out.println("HRÁČ č.2:");
        System.out.println("Hádaj hodnotu od 0 do 100.");
        Scanner vystup = new Scanner(System.in);
        int hadaj = vystup.nextInt();
        while (zadaj != hadaj) {
            if (zadaj > hadaj) {
                System.out.println("Zadaj väčšiu hodnotu.");
                hadaj = vystup.nextInt();
            }
            if (zadaj < hadaj) {
                System.out.println("Zadaj menšiu hodnotu.");
                hadaj = vystup.nextInt();
            }
        }
        if (zadaj == hadaj) {
            System.out.println("Zadal si správnu hodnotu.");
            System.out.println("Vyhral si.");
        }
    }
}