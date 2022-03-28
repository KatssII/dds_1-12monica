package com.company;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" digite o numero1 em metros ");
        Double numeroemmetros = scanner.nextDouble();
        Integer multiplicacao = 100;
        Double numeroemcentimetros = numeroemmetros * multiplicacao;

        System.out.print( "Seu numero convertido em metros para centimetros e: " + numeroemcentimetros );

        scanner.close();
    }
}
