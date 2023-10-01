package br.com.celular;

public abstract class ConfigCelular {
    boolean mensagem;
    boolean internet;
    boolean eMail;
    boolean radio;
    boolean tv;
    boolean arquivos;

    public ConfigCelular(boolean mensagem, boolean internet, boolean eMail, boolean radio, boolean tv, boolean arquivos) {
        this.mensagem = mensagem;
        this.internet = internet;
        this.eMail = eMail;
        this.radio = radio;
        this.tv = tv;
        this.arquivos = arquivos;
    }

    public boolean isMensagem() {
        return mensagem;
    }
    public boolean isInternet() {
        return internet;
    }
    public boolean iseMail() {
        return eMail;
    }
    public boolean isRadio() {
        return radio;
    }
    public boolean isTv() {
        return tv;
    }
    public boolean isArquivos() {
        return arquivos;
    }

    public void setMensagem(boolean mensagem) {
        this.mensagem = mensagem;
    }
    public void setInternet(boolean internet) {
        this.internet = internet;
    }
    public void seteMail(boolean eMail) {
        this.eMail = eMail;
    }
    public void setRadio(boolean radio) {
        this.radio = radio;
    }
    public void setTv(boolean tv) {
        this.tv = tv;
    }
    public void setArquivos(boolean arquivos) {
        this.arquivos = arquivos;
    }

    public abstract String configuracao();
}
