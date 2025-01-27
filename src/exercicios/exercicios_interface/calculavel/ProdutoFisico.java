package exercicios.exercicios_interface.calculavel;

public class ProdutoFisico extends Produto implements Calculavel {

    @Override
    public void calcularPrecoFinal(int desconto) {
        preco -= (getPreco() * (desconto / 100.0));
        System.out.println("O preço final do livro " + getNome() + " é: " + preco + "," + " e o desconto foi de: " + desconto + "%");
    }
}
