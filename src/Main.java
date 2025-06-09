import java.math.BigDecimal;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();


        ContaTerminal contaTerminal = new ContaTerminal(numeroConta, numeroAgencia, nomeCliente, new BigDecimal(saldo));
        contaTerminal.printContaCriadaComSucesso();

        scanner.close();

    }
}