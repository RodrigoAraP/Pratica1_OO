package br.com.projetoSocial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        distribuirAlimento() da = new DistribuicaoAlimento();

        int menu = 0;
        do {
            System.out.println("[1] Cadastrar Projeto Distribuir Alimentos.\n[2] Cadastrar Projeto Trabalho Voluntário.\n[3] Sair.");

            switch (menu) {
                case 1:
                    distribuirAlimento();
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
        }while (menu != 3);
    }
    private static void distribuirAlimento(){

    }

    private static void trabalhoVoluntario(){

    }
}
