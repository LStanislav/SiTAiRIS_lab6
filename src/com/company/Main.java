package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите N: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        if (n >= 1) {
            System.out.println("Сумма от 1 до N: " + n * (1 + n) / 2);
        } else {
            System.out.println("Сумма от 1 до N: " + (1 + n) * (2 - n) / 2);
        }
        // write your code here
    }
}
