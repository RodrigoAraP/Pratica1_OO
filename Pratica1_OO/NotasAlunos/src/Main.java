import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome,matricula,curso;
        int notaAV1,notaAV2,notaAE,periodo;

        System.out.println("Digite o nome do aluno: ");
        nome = input.nextLine();
        System.out.println("Matricula do aluno: ");
        matricula = input.nextLine();
        System.out.println("Curso: ");
        curso = input.nextLine();
        System.out.println("Periodo cursando: ");
        periodo = input.nextInt();
        System.out.println("Digite a nota da AV1: ");
        notaAV1 = input.nextInt();
        System.out.println("Digite a nota da AV2: ");
        notaAV2 = input.nextInt();
        System.out.println("Digite a nota da AE: ");
        notaAE = input.nextInt();

        Aluno a1 = new Aluno(nome,matricula,notaAV1,notaAV2,notaAE,curso,periodo);

        System.out.println("Estado: " + a1.aprovado());
        System.out.println("Resultado recuperação: " + a1.recuperacao());
    }
}