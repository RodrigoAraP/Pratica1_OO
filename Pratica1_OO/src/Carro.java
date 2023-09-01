public class Carro {
    private String modelo;
    private double preco;
    private int estoque;
    private String cor;

    public void Acrecimo(int qtd) {
        estoque += qtd;
    }

    public void Baixa(int qtd){
        if( qtd <= estoque)
            estoque -= qtd;
    }

    public double TotalEstoque(){
        return estoque*preco;
    }

    public String ConsultarEstoque(){
        return "Modelo: " + modelo + "Cor: " + cor + "Estoque: " + estoque + "Preço: R$" + preco;
    }

}
