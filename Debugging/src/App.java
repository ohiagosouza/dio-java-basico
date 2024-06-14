import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String[] alunos = { "Hiago", "Thalita", "Maria", "Alvaro" };

        double mediaNotas = calcularNota(alunos, scan);
        System.out.printf("Média dos alunos: %.2f", mediaNotas);
    }

    public static double calcularNota(String[] alunos, Scanner scanner) {
        double soma = 0.0;

        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();

            soma += nota;
        }

        return soma / alunos.length;
    }
}
