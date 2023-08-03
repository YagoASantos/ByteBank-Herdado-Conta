package modelo;

public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public double getTributo() {
        return super.getSaldo() * 0.02;
    }
    @Override
    public void saca(double valorSaque) throws SaldoInsuficienteException{
        super.saca(valorSaque + 0.2);
    }

    @Override
    public String toString() {
        return "Conta Corrente - " + super.toString();
    }
}
