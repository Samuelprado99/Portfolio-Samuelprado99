import java.util.Scanner;

public class CustoMacas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o número de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        // Cálculo
        double precoPorMaca = (quantidade < 12) ? 1.30 : 1.00;
        double custoTotal = quantidade * precoPorMaca;

        // Saída
        System.out.printf("O custo total da compra é: R$ %.2f%n", custoTotal);

        scanner.close();
    }
}