package teste;

import modelo.CalculadorImposto;
import modelo.ContaCorrente;
import modelo.SeguroDeVida;

public class Teste {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1111, 2222);
        SeguroDeVida seguroDeVida = new SeguroDeVida();
        CalculadorImposto calculadorImposto = new CalculadorImposto();
        contaCorrente.deposita(200);
        calculadorImposto.registra(contaCorrente);
        calculadorImposto.registra(seguroDeVida);
        System.out.println(calculadorImposto.getTotalImpostos());


    }
}
