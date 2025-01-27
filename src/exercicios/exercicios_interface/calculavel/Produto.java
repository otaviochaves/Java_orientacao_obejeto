package exercicios.exercicios_interface.calculavel;

public class Produto {
    private String nome;
    protected double preco;

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
