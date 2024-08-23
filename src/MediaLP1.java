import java.util.Scanner;

public class MediaLP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entradas
        System.out.print("Digite a nota da P1: ");
        double p1 = scanner.nextDouble();

        System.out.print("Digite a nota da E1: ");
        double e1 = scanner.nextDouble();

        System.out.print("Digite a nota da E2: ");
        double e2 = scanner.nextDouble();

        System.out.print("Digite a nota da API: ");
        double api = scanner.nextDouble();

        System.out.print("Digite a nota da X: ");
        double x = scanner.nextDouble();

        System.out.print("Digite a nota da SUB: ");
        double sub = scanner.nextDouble();

        // Cálculo da média
        double mediaBase = (p1 * 0.6 + ((e1 + e2) / 2) * 0.4) * 0.5;
        double apiContrib = Math.max((mediaBase - 5.9), 0) / ((mediaBase - 5.9) == 0 ? 1 : (mediaBase - 5.9)) * (api * 0.5);
        double mediaFinal = mediaBase + apiContrib + x + sub * 0.2;

        // Saída
        System.out.printf("A média de LP1 é: %.2f%n", mediaFinal);

        scanner.close();
    }
}