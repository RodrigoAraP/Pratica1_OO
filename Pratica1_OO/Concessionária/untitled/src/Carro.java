public class Carro {
    private String modelo;
    private double valor;
    private String cor;
    private int estoque;

    public void Acrecimo(int qnt){
        estoque += qnt;
    }

    public void Baixa(int qnt){
        if(qnt <= estoque)
            estoque -= qnt;
    }

    public double LucroLiquido(){
        return estoque * valor;
    }

    public String ConsultarEstoque(){
        return "Modelo: " + modelo + "\nCor: " + cor + "\nEstoque: " + estoque + "\nValor: R$" + valor;
    }
}