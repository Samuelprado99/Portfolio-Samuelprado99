import java.util.Scanner;

public class DuracaoXadrez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite a hora de início do jogo: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite a hora de fim do jogo: ");
        int fim = scanner.nextInt();

        // Cálculo
        int duracao;
        if (inicio < fim) {
            duracao = fim - inicio;
        } else {
            duracao = 24 - inicio + fim;
        }

        // Saída
        System.out.printf("A duração do jogo foi de %d horas.%n", duracao);

        scanner.close();
    }
}