package br.com.estoque;

public class Main {
    public static void main(String[] args) {
        Estoque e1 = new Estoque();
        e1.setNome("Telha");
        e1.setQtdAtual(5000);
        e1.setQtdMinima(1500);
        System.out.println("Relatorio: " + e1.mostra() + "\n" + "Repor: " + e1.precisaRepor());
    }
}