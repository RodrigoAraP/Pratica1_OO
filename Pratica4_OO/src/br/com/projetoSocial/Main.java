package br.com.projetoSocial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println("\n[1] Cadastrar Projeto Distribuir Alimentos.\n[2] Cadastrar Projeto Trabalho Voluntário.\n[3] Sair.");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    distribuicaoAlimentos();
                    break;
                case 2:
                    trabalhoVoluntario();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválidada");
                    break;
            }
        } while (menu != 3);
    }

    private static void trabalhoVoluntario() {
        TrabalhoVoluntario afoncoPena = new TrabalhoVoluntario("Limpesa Avenida Afonço Pena","Será realizado um mutirão de limpesa na Av. Afonço Pena","Av. Afonço Pena","03/10/2023","","Limpeza",5);
        System.out.println(afoncoPena.validaProjeto());
        System.out.println(afoncoPena.imprimeProjeto());
    }

    private static void distribuicaoAlimentos() {
        DistribuicaoAlimento pracaSete = new DistribuicaoAlimento("Alimentação Praça Sete","Será distribuido 1000 sopas de legumes em frente ao pirulito da praça seta.","Praça Sete","29/09","","Sopa de legumes",1000);
        System.out.println(pracaSete.validaProjeto());
        System.out.println(pracaSete.imprimeProjeto());
    }

}


