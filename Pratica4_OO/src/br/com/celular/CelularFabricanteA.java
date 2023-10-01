package br.com.celular;

import java.util.Scanner;

public class CelularFabricanteA extends ConfigCelular implements Celular {
    private String modelo;
    private String cor;
    private double preco;
    private int volume;

    public CelularFabricanteA(boolean mensagem, boolean internet, boolean eMail, boolean radio, boolean tv, boolean arquivos, String modelo, String cor, int preco, int qntd, int volume) {
        super(mensagem, internet, eMail, radio, tv, arquivos);
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.volume = volume;
    }

    public String getModelo() {
        return modelo;
    }
    public String getCor() {
        return cor;
    }
    public double getPreco() {
        return preco;
    }
    public int getVolume() {
        return volume;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void power(boolean ligado) {
        if (ligado) {
            System.out.println("Desligando telefone...");
            ligado = false;
        } else {
            System.out.println("Ligando telefone...");
            ligado = true;
        }
    }
    public void camera(boolean app) {
        if (app)
            System.out.println("Camera aberta");
    }
    public void acessoFone(boolean conectado) {
        if (conectado)
            System.out.println("Fone conectado");
        else
            System.out.println("Fone Desconectado");
    }
    public void controleVolume(boolean mudo) {
        if (getVolume() == 0) {
            mudo = true;
            System.out.println("Telefone mutado");
        } else {
            mudo = false;
            System.out.println("Volume em " + volume);
        }
    }

    public String configuracao() {
        return "\nModelo: " + getModelo() + "\nPreço: " + getPreco() + "\nCor: " + getCor() + "\nMensagem: " + isMensagem() + "\nInternet: " + isInternet() + "\ne-mail: " + iseMail() + "\nRádio: " + isRadio() + "\nTelevisão: " + isTv() + "\nArquivos: " + isArquivos();
    }
}