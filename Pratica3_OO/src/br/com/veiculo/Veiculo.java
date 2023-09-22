package br.com.veiculo;

public class Veiculo {
    private String placa;
    private int ano;

    public Veiculo() {
    }
    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }
    public int getAno() {
        return ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String exibirDados(){
        return "\nPlaca: " + getPlaca() + "\nAno: " + getAno();
    }
}
