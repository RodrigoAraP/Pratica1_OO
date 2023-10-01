package br.com.celular;

public class CelularFabricanteB extends ConfigCelular implements Celular{
    private String modelo;
    private String cor;
    private double preco;
    private int volume;
    private boolean botaoMudo;

    public CelularFabricanteB(boolean mensagem, boolean internet, boolean eMail, boolean radio, boolean tv, boolean arquivos, String modelo, String cor, double preco, int volume, boolean botaoMudo) {
        super(mensagem, internet, eMail, radio, tv, arquivos);
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.volume = volume;
        this.botaoMudo = botaoMudo;
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
    public boolean getBotaoMudo() {
        return botaoMudo;
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
    public void setBotaoMudo(boolean botaoMudo) {
        this.botaoMudo = botaoMudo;
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
        if (getVolume() == 0 || getBotaoMudo()) {
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
