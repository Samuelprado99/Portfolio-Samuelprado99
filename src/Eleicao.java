import java.util.Scanner;
public class Eleicao{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados
        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        System.out.print("Digite o número de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = scanner.nextInt();

        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = scanner.nextInt();

        // Cálculo dos percentuais
        double percentualBrancos = (votosBrancos / (double) totalEleitores) * 100;
        double percentualNulos = (votosNulos / (double) totalEleitores) * 100;
        double percentualValidos = (votosValidos / (double) totalEleitores) * 100;

        // Exibição dos resultados
        System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
        System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualValidos);

        scanner.close();
    }
}
