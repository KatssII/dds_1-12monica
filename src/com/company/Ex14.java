package com.company;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o peso do seu peixe: ");
        byte limiteDoPesoDoPeixe = 50;
        byte taxaExcedente =4;
        double pesoDoPeixe = scanner.nextDouble();
        double valorExcedente = (pesoDoPeixe - limiteDoPesoDoPeixe);
        double valorDaMulta = (valorExcedente * taxaExcedente);
        System.out.println(("O peso do seu peixe é: " + pesoDoPeixe) + ("O valo da sua multa é: ") + valorDaMulta);
        scanner.close();


    }
}
