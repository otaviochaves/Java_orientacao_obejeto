package exercicios.exercicios_interface.Vendavel;

public class Servico implements Vendavel {

    private String descricao;
    private double precoHora;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        precoHora =  precoHora * quantidade;
        return precoHora;
    }

    @Override
    public void aplicarDesconto(int percentualDesconto) {
       double desconto = precoHora - precoHora * (percentualDesconto / 100.0);
        System.out.println("O valor do serviço ficou: " + precoHora + " e com o desconto de: " + percentualDesconto + "% " + " fica: " + desconto);
    }
}