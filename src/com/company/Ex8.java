package com.company;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero de horas trabalhadas por mês: ");
        Double numeroDeHorasTrablhadas = scanner.nextDouble();

        System.out.print("Digite quanto você ganha por hora: ");
        Double numeroQueGanhaPorHora = scanner.nextDouble();

        Double valorSalarialMensal = (numeroDeHorasTrablhadas * numeroQueGanhaPorHora);
        System.out.print("Seu salario mensal é: " + valorSalarialMensal);

        scanner.close();
    }
}
