package br.com.contaInterface;

public class ContaPoupanca implements Conta {
    private double saldo;

    @Override
    public void depositar(double valor){
        this.saldo += valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor){
        this.saldo -= valor;
    }
}
