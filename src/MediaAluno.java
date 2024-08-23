import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite a nota da 1ª avaliação: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da 2ª avaliação: ");
        double nota2 = scanner.nextDouble();

        // Cálculo
        double media = (nota1 + nota2) / 2;

        // Saída
        if (media >= 6) {
            System.out.printf("Aluno aprovado com média: %.2f%n", media);
        } else {
            System.out.printf("Aluno reprovado com média: %.2f%n", media);
        }

        scanner.close();
    }
}