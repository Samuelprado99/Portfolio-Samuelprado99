import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        // Verificação e Saída
        if (valor1 > valor2) {
            System.out.printf("O maior valor é: %d%n", valor1);
        } else {
            System.out.printf("O maior valor é: %d%n", valor2);
        }

        scanner.close();
    }
}
