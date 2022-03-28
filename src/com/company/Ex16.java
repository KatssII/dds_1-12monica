package com.company;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a área desejada, em metros quadrados, para a pintura: ");
        Double areaEmMetrosQuadrados = scanner.nextDouble();
        int quantidadeDeLitrosPorMetro = 3;
        int quantidadeDeLataPorTinta = 18;
        int valorPorLata = 80;
        Double coberturaDaTinta = areaEmMetrosQuadrados / quantidadeDeLitrosPorMetro;
        Double quantidadeDeLata =  coberturaDaTinta / quantidadeDeLataPorTinta;
        Double total = quantidadeDeLata * valorPorLata;
        Double quantidadeDeLataArredondado = Math.ceil(quantidadeDeLata);
        System.out.println("A quantidade de latas é: " + quantidadeDeLataArredondado);
        System.out.print("O valor total é: " + total);
        scanner.close();
    }
}
