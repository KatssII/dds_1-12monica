package com.company;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" digite o valor do lado ");
        Double valorDoLado = scanner.nextDouble();
        System.out.print("O valor do quadrado e: " + valorDoLado);
        scanner.close();
    }
}
