import java.util.Scanner;

public class SalarioComHorasExtras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = scanner.nextDouble();

        // Cálculo
        int horasRegulares = 160; // 40 horas por semana * 4 semanas
        double salarioTotal;

        if (horasTrabalhadas > horasRegulares) {
            int horasExtras = horasTrabalhadas - horasRegulares;
            double valorHoraExtra = salarioPorHora * 1.5;
            salarioTotal = (horasRegulares * salarioPorHora) + (horasExtras * valorHoraExtra);
        } else {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        }

        // Saída
        System.out.printf("O salário total do funcionário é: R$ %.2f%n", salarioTotal);

        scanner.close();
    }
}