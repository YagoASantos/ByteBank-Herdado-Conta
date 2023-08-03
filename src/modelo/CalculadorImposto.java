package modelo;

public class CalculadorImposto {
    private static double totalImpostos;

    public double getTotalImpostos () {
        return CalculadorImposto.totalImpostos;
    }
    public void registra (Tributavel t) {
        CalculadorImposto.totalImpostos += t.getTributo();
    }
}
