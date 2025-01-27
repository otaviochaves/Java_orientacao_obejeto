package exercicios.exercicios_interface.calculavel;

public class Livro  extends Produto implements Calculavel{
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void calcularPrecoFinal(int desconto) {
        preco -= (preco * (desconto / 100.0));
        System.out.println("O preço final do livro, " + getNome() + " do autor " + autor + " é: " + preco + " , " + " e o desconto foi de: " + desconto + "%");
    }
}
