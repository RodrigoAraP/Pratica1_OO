package pkg;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Categoria eletronicos = new Categoria("Eletrônicos");

        Produto produto1 = new Produto("Celular", 5700.00, "Iphone 14", 10, eletronicos);
        Produto produto2 = new Produto("Notebook", 1200.00, "Notebook Samsung", 5, eletronicos);
        Produto produto3 = new Produto("Smart TV", 1400.00, "4K Smart TV", 8, eletronicos);
        Produto produto4 = new Produto("Fones de Ouvido", 150.50, "Fone Bluetooth", 15, eletronicos);
        Produto produto5 = new Produto("Tablet", 4.900, "Ipad", 12, eletronicos);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);
        listaProdutos.add(produto5);


        ArrayList<Pedido> listaPedidos = new ArrayList<>();

        Pedido pedido1 = new Pedido(1, new Date(), 0.0, 1);
        PedidoItem item1 = new PedidoItem("Celular", 2, 5700.00);
        PedidoItem item2 = new PedidoItem("Notebook", 1, 1200.00);

        pedido1.inserirItensPedido(item1);
        pedido1.inserirItensPedido(item2);

        Pedido pedido2 = new Pedido(2, new Date(), 0.0, 1);
        PedidoItem item3 = new PedidoItem("Smart TV", 1, 1400.00);
        PedidoItem item4 = new PedidoItem("Fones de Ouvido", 3, 150.50);
        PedidoItem item5 = new PedidoItem("Tablet", 2, 4.900);

        pedido2.inserirItensPedido(item3);
        pedido2.inserirItensPedido(item4);
        pedido2.inserirItensPedido(item5);

        listaPedidos.add(pedido1);
        listaPedidos.add(pedido2);

        System.out.println("[Lista de Produtos]\n");
        for (Produto produto : listaProdutos) {
            System.out.println("Nome: " + produto.getNomeProduto() + ", Preço: " + produto.getPrecoProduto() + ", Estoque: " + produto.getEstoqueAtual());
        }

        System.out.println("\n[Lista de Pedidos]\n");
        for (Pedido pedido : listaPedidos) {
            System.out.println("Número: " + pedido.getNumeroPedido() + ", Data: " + pedido.getDataHoraPedido() + ", Status: " + pedido.getStatusPedido());
            System.out.println("\n[Itens do Pedido]\n");
            for (PedidoItem item : pedido.itensPedido) {
                System.out.println("- Nome: " + item.getNomeItem() + ", Quantidade: " + item.getQtdItem() + ", Preço: " + item.getPrecoItem());
            }
            double totalPagar = pedido.calculaTotalPagar();
            System.out.println("\nTotal a pagar: " + totalPagar);
        }
    }
}

