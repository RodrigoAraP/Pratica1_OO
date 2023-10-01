package br.com.celular;

public class Main {
    public static void main(String[] args) {
        CelularFabricanteA cellA = new CelularFabricanteA(true,true,true,true,false,true,"R15","Preto",6800,700,10);
        CelularFabricanteB cellb = new CelularFabricanteB(true,true,true,false,true,true,"G34","Branco",5200,90,true);
        System.out.println(cellA.configuracao());
        System.out.println(cellb.configuracao());

    }
}
