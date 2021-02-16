package testes;

import contas.ContaCorrente;
import contas.ContaPoupanca;

public class TesteContas {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(111,111);
        contaCorrente.deposita(100);

        ContaPoupanca contaPoupanca = new ContaPoupanca(222,222);
        contaPoupanca.deposita(200);

        contaCorrente.transfere(10,contaPoupanca);

        System.out.println("Saldo conta corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo conta poupança: " + contaPoupanca.getSaldo());

    }
}
