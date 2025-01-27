package exercicios.exercicios_heranca.contaBancaria;

public class ContaCorrente extends ContaBancaria{

    private double tarifaMensal;

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
    }
}
