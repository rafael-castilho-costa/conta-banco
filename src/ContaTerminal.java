import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar e receber o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agency = scanner.nextLine();
        // Solicitar e receber o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int number = scanner.nextInt();
        scanner.nextLine();
        // Solicitar e receber o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nameClient = scanner.nextLine();

        // Solicitar e receber o saldo
        System.out.println("Por favor, digite o saldo:");
        double balance = scanner.nextDouble();

        //Exibi a mensagem de boas-vindas com os dados informado pelo cliente
        System.out.println("Olá " + nameClient + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agency + ", conta " + number + " e seu saldo " + balance + " já está disponível para saque.");

        scanner.close();
    }
}
