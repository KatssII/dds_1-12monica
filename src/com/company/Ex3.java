package com.company;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" digite o numero1 ");
        Integer numero1 = scanner.nextInt();
        System.out.print(" digite o numero2 ");
        Integer numero2 = scanner.nextInt();
        System.out.print("Seu numero somado e: " + (numero1 + numero2));
        scanner.close();
    }
}
