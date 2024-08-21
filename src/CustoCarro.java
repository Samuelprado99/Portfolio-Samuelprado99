import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada: custo de fábrica
        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        // Percentuais
        double percentualDistribuidor = 28.0 / 100.0;
        double percentualImpostos = 45.0 / 100.0;

        // Cálculo do custo do distribuidor e dos impostos
        double custoDistribuidor = custoFabrica * percentualDistribuidor;
        double custoImpostos = custoFabrica * percentualImpostos;

        // Cálculo do custo final ao consumidor
        double custoFinal = custoFabrica + custoDistribuidor + custoImpostos;

        // Saída: custo final ao consumidor
        System.out.printf("O custo final ao consumidor é: R$ %.2f%n", custoFinal);
        
        scanner.close();
    }
}