public class Aluno {
    private String nome;
    private String matricula;
    private int notaAV1;
    private int notaAV2;
    private int notaAE;
    private String curso;
    private int periodo;

    public Aluno(String nome, String matricula, int notaAV1, int notaAV2, int notaAE, String curso, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.notaAE = notaAE;
        this.curso = curso;
        this.periodo = periodo;
    }

    public void alteraNotaAV1(int nota){
        notaAV1 = nota;
    }

    public void alteraNotaAV2(int nota){
        notaAV2 = nota;
    }

    public void alteraNotaAE(int nota){
        notaAE = nota;
    }

    public String aprovado(){
        if((notaAV1 + notaAV2) >= 60)
            return "Aprovado";
        else
            return "Recuperação";

    }

    public String recuperacao(){
        if ((notaAV1 + notaAV2 + notaAE)/3 >= 60)
            return "Aprovado";
        else
            return "Reprovado";
    }

}
