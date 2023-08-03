package teste;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.SaldoInsuficienteException;

public class TestaSaque {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);
        try{
            conta.saca(1);
        } catch(SaldoInsuficienteException ex) {
            ex.printStackTrace();
        }
    }
}
