package br.com.estoque;

public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque() {
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }
    public int getQtdAtual() {
        return qtdAtual;
    }
    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }
    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void darBaixa(int qtde){
        if ((qtdAtual - qtde) > 0)
            qtdAtual -= qtde;
    }

    public String mostra(){
        return "Nome: " + nome + "\nQuantidade atual: " + qtdAtual + "\nQuantidade mínima: " + qtdMinima;
    }

    public boolean precisaRepor(){
        if (qtdAtual <= qtdMinima)
            return true;
        else
            return false;
    }

}
