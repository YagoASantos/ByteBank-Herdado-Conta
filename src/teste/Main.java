package teste;

import modelo.ContaCorrente;
import modelo.ContaPoupanca;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(111, 111);
        ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);
        contaPoupanca.deposita(100);
        contaCorrente.deposita(100);
//        contaCorrente.transfere(10, contaPoupanca);
        System.out.println("modelo.Conta corrente: " + contaCorrente.getSaldo());
        System.out.println("modelo.Conta poupança: " + contaPoupanca.getSaldo());
    }
}