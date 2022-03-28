package com.company;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu valor em Fahrenheit");
        Double valorFahrenheit = scanner.nextDouble();

        Double formula = (5 *(valorFahrenheit - 32) / 9);
        Double valorEmCelsius = formula;

        System.out.print("Seu valor em Celsius é " + valorEmCelsius);

    }
}
