import java.util.Scanner;

public class VerificaPositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        // Verificação e Saída
        if (valor >= 0) {
            System.out.println("O valor é positivo.");
        } else {
            System.out.println("O valor é negativo.");
        }
        scanner.close();
    }
}
