package exercicios.exercicios_interface.Vendavel;

public class Produto implements Vendavel {
    private String nome;
    private double precoUnitario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        precoUnitario =  precoUnitario * quantidade;
        return precoUnitario;
    }

    @Override
    public void aplicarDesconto(int percentualDesconto) {
        double desconto = precoUnitario - precoUnitario * (percentualDesconto / 100.0);
        System.out.println("O valor unitario do produto é: " + precoUnitario + " e com o desconto de: " + percentualDesconto + "% " + " fica: " + desconto);
    }
}
