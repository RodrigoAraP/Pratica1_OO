package br.com.projetoSocial;

public class TrabalhoVoluntario extends Projeto{
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim, String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }
    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    @Override
    public boolean validaProjeto() {
        if (getDuracaoTrabalho() > 2)
            return true;
        else
            return false;
    }

    @Override
    public String imprimeProjeto() {
        return "Nome do Projeto: " + getNomeProjeto() + "\nDescrição do Projeto: " + getDescricao() + "\nData Inicial: " + getDatainicio() + "\nData Final: " + getDatafim() + "Tipo de Trabalho: " + getTipoTrabalho() + "Duração do Trabalho: " + getDuracaoTrabalho();
    }
}
