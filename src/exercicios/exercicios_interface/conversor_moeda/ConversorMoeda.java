package exercicios.exercicios_interface.conversor_moeda;

public class ConversorMoeda implements ConversaoFinanceira {
    private double taxa;
    private int dolar;

    public int getDolar() {
        return dolar;
    }

    public void setDolar(int dolar) {
        this.dolar = dolar;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }


    @Override
    public void converterDolarParaReal(double valorDolar) {
        if (taxa <= 0) {
            System.out.println("A taxa tem que ser maior que zero");
        } else {
            valorDolar = this.dolar * taxa;
            System.out.println(dolar + " USD equivale a " + valorDolar + " BRL");
        }
    }
}
