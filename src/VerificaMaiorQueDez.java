import java.util.Scanner;

public class VerificaMaiorQueDez {
     public static void main(String[] args) {
        //Criando classe scanner
        Scanner scanner = new Scanner(System.in); 
        
        //Entrada valores
        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        //Verificação e Saída
        //Se a condição for de acordo
        if (valor > 10) {
            System.out.println("É MAIOR QUE 10!");
        } //senao mostrar essa condição 
        else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
        //fechar scanner
        scanner.close();
    }
}
