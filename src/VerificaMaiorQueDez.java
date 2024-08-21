import java.util.Scanner;

public class VerificaMaiorQueDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        // Verificação e Saída
        if (valor > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }

        scanner.close();
    }
}
