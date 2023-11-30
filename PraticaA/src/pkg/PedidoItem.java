package pkg;

import java.util.ArrayList;

public class PedidoItem {

    String nomeItem;
    int qtdItem;
    double precoItem;

    public PedidoItem(String nomeItem, int qtdItem, double precoItem) {
        this.nomeItem = nomeItem;
        this.qtdItem = qtdItem;
        this.precoItem = precoItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }
    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getQtdItem() {
        return qtdItem;
    }
    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }
    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public boolean atualizaEstoqueItem(ArrayList<Produto> listaProdutos) {
        for (Produto produto : listaProdutos) {
            if (produto.nomeProduto.equals(this.nomeItem)) {
                // Atualizar o estoque do produto
                produto.estoqueAtual -= this.qtdItem;
                return true; // Produto encontrado e estoque atualizado
            }
        }
        return false; // Produto não encontrado
    }
}

