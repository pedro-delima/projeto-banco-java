import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao banco legal!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe o seu tipo de conta (1- corrente/ 2- poupança)");
        int tipoConta = scanner.nextInt();

        System.out.println("Informe o seu saldo: ");
        double saldo = scanner.nextDouble();

        String conta = "";
        switch (tipoConta) {
            case 1:
                conta = "corrente";
                break;
            case 2:
                conta = "poupança";
                break;
            default:
                conta = "Tipo de conta inválido";
                break;
        }

        System.out.println("-------------------------------");
        System.out.println("Cliente: " + nome);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("Saldo: " + saldo);
        System.out.println("-------------------------------");

        int operacao = 0;

        while (operacao != 4) {
            System.out.println("\nInforme a operação desejada:");
            System.out.println("1- Verificar saldo");
            System.out.println("2- Fazer depósito");
            System.out.println("3- Fazer saque");
            System.out.println("4- Sair");

            operacao = scanner.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 2:
                    System.out.println("Informe o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        System.out.println("Depósito feito com sucesso.");
                    } else {
                        System.out.println("Valor de depósito inválido.");
                    }
                    break;

                case 3:
                    System.out.println("Informe o valor do saque: ");
                    double saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque feito com sucesso.");
                    }
                    break;

                case 4:
                    System.out.println("Fim do programa.");
                    break;

                default:
                    System.out.println("Operação inválida, por favor, tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}