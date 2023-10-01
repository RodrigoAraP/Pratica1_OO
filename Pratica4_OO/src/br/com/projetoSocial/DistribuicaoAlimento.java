package br.com.projetoSocial;

public class DistribuicaoAlimento extends Projeto {
    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }
    public float getQtde() {
        return qtde;
    }

    @Override
    public boolean validaProjeto() {
        if (getDatafim() == "")
            return true;
        else
            return false;
    }

    @Override
    public String imprimeProjeto() {
        return "\nNome do Projeto: " + getNomeProjeto() + "\nDescrição do Projeto: " + getDescricao() + "\nData Inicial: " + getDatainicio() + "\nData Final: " + getDatafim() + "\nDescrição dos Alimento: " + getDescAlimento() + "\nQuantidade" + getQtde();
    }
}


