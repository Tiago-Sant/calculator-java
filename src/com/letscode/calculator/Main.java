package com.letscode.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número");
        float number1 = sc.nextFloat();
        System.out.println("Informe mais um número: ");
        Scanner sc2 = new Scanner(System.in);
        float number2 = sc2.nextFloat();

        System.out.printf("%.0f + %.0f = %.0f %n", number1, number2, (number1 + number2));
        System.out.printf("%.0f - %.0f = %.0f %n", number1, number2, (number1 - number2));
        System.out.printf("%.0f / %.0f = %.1f %n", number1, number2, (number1 / number2));
        System.out.printf("%.0f x %.0f = %.0f %n", number1, number2, (number1 * number2));
    }
}
