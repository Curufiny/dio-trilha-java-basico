import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        Double saldo;

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da conta!");
        numero = sc.nextInt();

        System.out.println("Agora digite seu saldo! ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + "já está disponível para saque.");

    }
}
