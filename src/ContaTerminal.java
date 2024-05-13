import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e receber o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        // Solicitar e receber o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();
        // Solicitar e receber o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicitar e receber o saldo
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        //Exibi a mensagem de boas-vindas com os dados informado pelo cliente
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}
