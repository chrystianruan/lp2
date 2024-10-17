import java.util.Scanner;

public class Main {

    private static final double VISUALIZAR_SALDO = 1;
    private static final double DEPOSITAR = 2;
    private static final double SACAR = 3;
    private static final double SAIR = 0;

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Chrystian", "112", "1234");
        ContaBancaria contaBancaria = new ContaBancaria("2023", "231343", cliente, 10000);
        contaBancaria.setCliente(cliente);

        System.out.println("Olá "+ cliente.getNome());

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("-------------------------------------------------");
            System.out.println("Selecione algumas das opções: ");
            System.out.println("1 - Visualizar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");

            double entrada = scanner.nextDouble();

            if (entrada == VISUALIZAR_SALDO) {
                System.out.println("Saldo: R$ "+contaBancaria.getSaldo());
            } else if (entrada == SACAR) {
                System.out.println("Digite o valor a ser sacado: ");
                double valor = scanner.nextDouble();
                contaBancaria.sacar(valor);
                System.out.println("Saldo: R$ " + contaBancaria.getSaldo());
            } else if (entrada == DEPOSITAR) {
                System.out.println("Digite o valor a ser depositado: ");
                double valor = scanner.nextDouble();
                contaBancaria.depositar(valor);
                System.out.println("Saldo: R$ " + contaBancaria.getSaldo());
            } else if (entrada == SAIR) {
                break;
            } else {
                System.out.println("Valor inválido. Tente novamente");
            }
        }

    }
}
