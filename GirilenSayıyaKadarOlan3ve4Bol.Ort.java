package com.company;

import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {

        int sayi, toplam=0, sayac=0;
        double ort;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayý giriniz: ");
        sayi = scanner.nextInt();


        for (int i = 0; i <= sayi; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                toplam=toplam+i;
                sayac++;

            }
        }
        ort=toplam/sayac;
        System.out.println("ortalama = " + ort);

    }
}