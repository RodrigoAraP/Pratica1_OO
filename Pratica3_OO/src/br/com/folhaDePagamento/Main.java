package br.com.folhaDePagamento;

public class Main {
    public static void main(String[] args) {
        FPadrao f1 = new FPadrao(1,"Rodrigo",10000);
        System.out.println(f1.toString());

        FComissionado fc1 = new FComissionado(2,"João",1500,2,10000);
        System.out.println(fc1.toString());

        FProdutividade fp1 = new FProdutividade(3,"Maria",1500,0.5,1500);
        System.out.println(fp1.toString());
    }
}
