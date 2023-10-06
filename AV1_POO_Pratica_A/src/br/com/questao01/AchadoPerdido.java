package br.com.questao01;

import javax.swing.*;

public class AchadoPerdido implements Publicacao{
    private String titulo;
    private String descricao;
    private String foto;
    private String tipo;
    private String local_achado;
    private String data_hora;
    private String status;

    public AchadoPerdido(String titulo, String descricao, String tipo, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getFoto() {
        return foto;
    }
    public String getTipo() {
        return tipo;
    }
    public String getLocal_achado() {
        return local_achado;
    }
    public String getData_hora() {
        return data_hora;
    }
    public String getStatus() {
        return status;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setLocal_achado(String local_achado) {
        this.local_achado = local_achado;
    }
    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public void completaDados(String foto, String local_achado, String data_hora) {
        this.foto = foto;
        this.local_achado = local_achado;
        this.data_hora = data_hora;
    }


    public String buscarTitulo() {
        return "\nTitulo: " + getTitulo() + "\nDescrição: " + getDescricao() + "\nLocal achado: " + getLocal_achado();
    }

    public String visualizarDetalhes(){
        return  "\nTitulo: " + getTitulo() + "\nFoto: " + getFoto() + "\nLocal achado: " + getLocal_achado() + "\nTipo: " + getTipo() + "\nStatus: " + getStatus();
    }
}
