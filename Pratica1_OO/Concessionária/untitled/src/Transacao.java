public class Transacao {
    private String modelo;
    private String cliente;
    private double valor;

    public String compra(){
        return  "Cliente: " + cliente + "\nModelo: " + modelo + "\nValor" + valor;
    }
}
