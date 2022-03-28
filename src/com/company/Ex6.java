package com.company;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" digite o raio ");
        Double raio = scanner.nextDouble();
        Double raio1  = raio * raio;
        System.out.print(raio1);
        scanner.close();
    }
}
