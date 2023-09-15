package br.com.rendimento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor inicial do Rendimento: ");
        double vrInicial = input.nextDouble();

        System.out.println("Digite a taxa de juros: ");
        double txJuros = input.nextDouble();

        System.out.println("Digite o número de meses para o Rendimento: ");
        int numMeses = input.nextInt();

        Rendimento r1 = new Rendimento(vrInicial,txJuros,numMeses);
        r1.calculoRendimento();
    }
}
