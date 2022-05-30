package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день недели: 1, 2, 3, 4, 5, 6, 7");
        int day = sc.nextInt();
        if (day == 1) {
            System.out.println(DniNedeli.Monday);
        } else if (day == 2) {
            System.out.println(DniNedeli.Tuesday);
        } else if (day == 3) {
            System.out.println(DniNedeli.Wednesday);
        } else if (day == 4) {
            System.out.println(DniNedeli.Thursday);
        } else if (day == 5) {
            System.out.println(DniNedeli.Friday);
        } else if (day == 6) {
            System.out.println(DniNedeli.Saturday);
        } else if (day == 7) {
            System.out.println(DniNedeli.Sunday);

//        System.out.println(DniNedeli.Monday);
//        System.out.println(DniNedeli.Tuesday);
//        System.out.println(DniNedeli.Wednesday);
//        System.out.println(DniNedeli.Thursday);
//        System.out.println(DniNedeli.Friday);
//        System.out.println(DniNedeli.Saturday);
//        System.out.println(DniNedeli.Sunday);

        }
    }
}