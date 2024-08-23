public class DespesaTrimestre {
    public static void main(String[] args) {
        // Gastos dos meses
        int gastoJaneiro = 15000;
        int gastoFevereiro = 23000;
        int gastoMarco = 17000;

        // Cálculo da despesa total
        int despesaTotal = gastoJaneiro + gastoFevereiro + gastoMarco;

        // Cálculo da média mensal
        double mediaMensal = despesaTotal / 3.0;

        // Saída
        System.out.printf("A despesa total no trimestre foi: R$ %d%n", despesaTotal);
        System.out.printf("A média mensal de gastos foi: R$ %.2f%n", mediaMensal);
    }
}