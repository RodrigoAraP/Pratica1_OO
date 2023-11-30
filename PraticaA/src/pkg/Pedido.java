package pkg;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    int numeroPedido;
    Date dataHoraPedido;
    double precoTotal;
    int statusPedido;
    ArrayList<PedidoItem> itensPedido = new ArrayList<>();

    public Pedido(int numeroPedido, Date dataHoraPedido, double precoTotal, int statusPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.precoTotal = precoTotal;
        this.statusPedido = statusPedido;
    }

    public void inserirPedido(int numeroPedido, Date dataHoraPedido, double precoTotal, int statusPedido, ArrayList<PedidoItem> itensPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.precoTotal = precoTotal;
        this.statusPedido = statusPedido;
        this.itensPedido = itensPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }
    public void setDataHoraPedido(Date dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }
    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getStatusPedido() {
        return statusPedido;
    }
    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    public ArrayList<PedidoItem> getItensPedido() {
        return itensPedido;
    }
    public void setItensPedido(ArrayList<PedidoItem> itensPedido) {
        this.itensPedido = itensPedido;
    }

    public void alterarStatus(int novoStatus) {
        this.statusPedido = novoStatus;
    }

    public boolean consultarPedido(Pedido pedidoParaConsultar) {
        return this.numeroPedido == pedidoParaConsultar.numeroPedido;
    }

    public void inserirItensPedido(PedidoItem item) {
        itensPedido.add(item);
    }

    public void excluirItensPedido(PedidoItem item) {
        itensPedido.remove(item);
    }

    public double calculaTotalPagar() {
        double total = 0;

        for (PedidoItem item : itensPedido) {
            total += item.precoItem * item.qtdItem;
        }

        return total;
    }
}
