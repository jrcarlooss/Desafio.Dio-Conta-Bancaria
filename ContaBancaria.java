import java.util.Scanner;

public class ContaBancaria {
    private String nomeTitular;
    private double saldo;

    // Construtor
    public ContaBancaria(String nomeTitular, double saldoInicial) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    // Método para exibir saldo
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque inválido. Saldo insuficiente ou valor inválido.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar conta
        System.out.print("Digite o nome do titular: ");
        String nomeTitular = scanner.nextLine();
        System.out.print("Digite o saldo inicial: R$ ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(nomeTitular, saldoInicial);

        // Operações básicas
        int opcao;
        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Exibir saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.exibirSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor do depósito: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor do saque: R$ ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
