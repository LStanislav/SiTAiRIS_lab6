package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите N: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        }
        else {
            for (int i=1; i>=n; i--){
                sum+=i;
            }
        }
        System.out.println("Сумма от 1 до N: " + sum);
        // write your code here
    }
}
