package com.company;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de horas trabalhadas por mês: ");
        Double numeroDeHorasTrabalhadas = scanner.nextDouble();
        System.out.print("Digite quanto você ganha poor hora: ");
        Double numeroQueganhaPorHora = scanner.nextDouble();
        Double salarioBruto = (numeroDeHorasTrabalhadas * numeroQueganhaPorHora);
        System.out.print(salarioBruto);
        Double impostoDerenda = 0.11;
        Double inss = 0.08;
        Double sindicato = 0.05;
        Double salarioBrutoImpostoDeRenda = salarioBruto * impostoDerenda;
        Double salarioBrutoInss = salarioBruto * inss;
        Double salarioBrutoSindicato = salarioBruto * sindicato;
        Double somaDosImpostos = salarioBrutoImpostoDeRenda + salarioBrutoInss +salarioBrutoSindicato;
        Double salarioLiquido = salarioBruto - somaDosImpostos;
        System.out.println("Seu salário bruto é: " + salarioBruto);
        System.out.println("O quanto você pagou para o inss é: " + salarioBrutoInss);
        System.out.println("O valor que pagou ao sindicato é: " + salarioBrutoSindicato);
        System.out.println("O seu salário liquído é: " + salarioLiquido);
        scanner.close();
    }
}
