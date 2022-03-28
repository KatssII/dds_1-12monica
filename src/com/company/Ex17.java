package com.company;

import java.util.Scanner;

public class Ex17 {
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
        double quantidadeDeTintaPorGalao = 3.6;
        int valorPorGalao = 25;
        Double coberturaDaTintaEmGalao = areaEmMetrosQuadrados  * quantidadeDeTintaPorGalao;
        Double quantidadeDeGalao =  coberturaDaTinta / quantidadeDeTintaPorGalao;
        Double quantidadePagaPorGalao = quantidadeDeGalao * valorPorGalao;
        Double quantidadePagaPorLataArredondado = Math.ceil(valorPorLata);
        Double quantidadePagaPorGalaoArredondado = Math.ceil(valorPorGalao);
        System.out.println("O valor pago por latas é: " + quantidadePagaPorGalaoArredondado);
        System.out.println("A quantidade em latas é: " + quantidadeDeLata);
        System.out.println("O valor pago por galão: " + quantidadePagaPorLataArredondado);
        System.out.println("A quantidade por gatão é: " + quantidadeDeGalao);
        Dou

        Double folga = 1.1;



        scanner.close();
    }
}
