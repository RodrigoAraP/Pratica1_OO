public class Cliente {
    private String cpf;
    private String nome;
    private int parcela;
    private double valor;

    public Cliente(String cpf, String nome, int parcela, double valor) {
        this.cpf = cpf;
        this.nome = nome;
        this.parcela = parcela;
        this.valor = valor;
    }

    public void Pagamento(){
        if(parcela>0)
            parcela =- 1;
    }
    public double Divida(){
        return valor * parcela;
    }
    public String ConsultarCliente(){
        return "Nome: " + nome + "\nCPF: " + cpf + "\nValor: R$ " + valor + "\nTotal: R$ " + Divida();
    }
}
