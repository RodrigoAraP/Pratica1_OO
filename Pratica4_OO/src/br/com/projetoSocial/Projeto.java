package br.com.projetoSocial;

public abstract class Projeto {
    private String nomeProjeto;
    private String descricao;
    private String endereco;
    private String datainicio;
    private String datafim;

    public Projeto(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.endereco = endereco;
        this.datainicio = datainicio;
        this.datafim = datafim;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getDatainicio() {
        return datainicio;
    }
    public String getDatafim() {
        return datafim;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setDatainicio(String datainicio) {
        this.datainicio = datainicio;
    }
    public void setDatafim(String datafim) {
        this.datafim = datafim;
    }

    public abstract boolean validaProjeto();
    public abstract String imprimeProjeto();
}
