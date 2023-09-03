public class EmpregoFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    public EmpregoFaculdade(String nome, double salario, int horasAula) {
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }

    double getGastos(){
        return 40*horasAula;
    }
    String getInfo(){
        return "Nome: " + nome + "\nSalario: R$ " + salario + "\nTotal: R$ " + (salario += getGastos());
    }
}
