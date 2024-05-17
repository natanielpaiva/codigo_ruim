package nataniel;

import java.util.*;

public class ContaBancaria {
    static double saldo;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {

            int opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.println("Quanto você quer depositar?");
                double valor = scanner.nextDouble();
                if (valor > 0) saldo += valor; else System.out.println("Valor inválido");
            } else if (opcao == 2) {
                System.out.println("Quanto você quer sacar?");
                double valor = scanner.nextDouble();
                if (valor > 0 && saldo >= valor) saldo -= valor; else System.out.println("Saldo insuficiente ou valor inválido");
            } else if (opcao == 3) {
                System.out.println("Seu saldo é: " + saldo);
            } else if (opcao == 0) {
                break;
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}
