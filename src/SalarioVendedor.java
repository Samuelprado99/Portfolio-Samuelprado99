import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o salário fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor da comissão por carro vendido: ");
        double comissaoPorCarro = scanner.nextDouble();

        System.out.print("Digite o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double valorTotalVendas = scanner.nextDouble();

        // Cálculo
        double comissaoTotal = comissaoPorCarro * carrosVendidos;
        double porcentagemSobreVendas = valorTotalVendas * 0.05;
        double salarioFinal = salarioFixo + comissaoTotal + porcentagemSobreVendas;

        // Saída
        System.out.printf("O salário final do vendedor é: R$ %.2f%n", salarioFinal);

        scanner.close();
    }
}