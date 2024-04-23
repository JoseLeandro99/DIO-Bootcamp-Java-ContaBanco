import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("## Sistema de Conta Bancária ##\n");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.print("Digite seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite seu saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        scanner.close();

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, numeroAgencia, numeroConta, saldo);

        System.out.println(mensagem);
    }
}
