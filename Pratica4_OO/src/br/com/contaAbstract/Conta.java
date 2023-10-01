package br.com.contaAbstract;

abstract public class Conta {
    private  double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void imprimeExtrato();
}
