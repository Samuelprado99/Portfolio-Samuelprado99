import java.util.Scanner;
public class Salario{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados
        System.out.print("Digite o salário atual: R$ ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite o percentual de aumento (%): ");
        double percentualAumento = scanner.nextDouble();

        // Cálculo do aumento e do novo salário
        double valorAumento = (salarioAtual * percentualAumento) / 100;
        double novoSalario = salarioAtual + valorAumento;

        // Exibição dos resultados
        System.out.printf("O valor do aumento é: R$ %.2f\n", valorAumento);
        System.out.printf("O novo salário é: R$ %.2f\n", novoSalario);

        scanner.close();
    }
}