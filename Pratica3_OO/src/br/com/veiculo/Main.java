package br.com.veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("ABC1234",2020);
        System.out.println(v1.exibirDados());

        Onibus o1 = new Onibus("DEF5678",2015,20);
        System.out.println(o1.exibirDados());

        Caminhao c1 = new Caminhao("GHI9012",2023,6);
        System.out.println(c1.exibirDados());
    }
}
