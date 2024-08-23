import java.util.Scanner;

public class DireitoVoto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        // Cálculo
        int idade = anoAtual - anoNascimento;

        // Saída
        if (idade >= 16) {
            System.out.println("Você poderá votar este ano.");
        } else {
            System.out.println("Você não poderá votar este ano.");
        }

        scanner.close();
    }
}