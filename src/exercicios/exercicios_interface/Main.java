package exercicios.exercicios_interface;

import exercicios.exercicios_interface.ConversorTemperatura.ConversorTemperatura;
import exercicios.exercicios_interface.ConversorTemperatura.ConversorTemperaturaPadrao;
import exercicios.exercicios_interface.Vendavel.Produto;
import exercicios.exercicios_interface.Vendavel.Servico;
import exercicios.exercicios_interface.calcular_sala_retangular.CalcularSalaRetangular;
import exercicios.exercicios_interface.calculavel.Livro;
import exercicios.exercicios_interface.calculavel.ProdutoFisico;
import exercicios.exercicios_interface.conversor_moeda.ConversorMoeda;
import exercicios.exercicios_interface.tabuada_multiplicacao.TabuadaMultiplicacao;

public class Main {
    public static void main(String[] args) {

        ConversorMoeda conversorMoeda = new ConversorMoeda();

        conversorMoeda.setDolar(100);
        conversorMoeda.setTaxa(5.10);

        conversorMoeda.converterDolarParaReal(100);
        System.out.println("--------------------------");

        CalcularSalaRetangular calcularSalaRetangular = new CalcularSalaRetangular();
        calcularSalaRetangular.calcularArea(2.10,10);
        calcularSalaRetangular.calcularPerimetro(2.10,10);

        System.out.println("--------------------------");

        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();
        tabuadaMultiplicacao.mostrarTabuada(10);

        System.out.println("--------------------------");

        ConversorTemperatura conversor = new ConversorTemperaturaPadrao();

        double temperaturaCelsius = 25;
        double temperaturaFahrenheit = conversor.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit.");

        temperaturaFahrenheit = 77;
        temperaturaCelsius = conversor.fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + " Fahrenheit é igual a " + temperaturaCelsius + " Celsius.");

        System.out.println("--------------------------");

        Livro livro = new Livro();
        livro.setNome("Diario De Um Banana");
        livro.setAutor("Otavio Chaves");
        livro.setPreco(200);
        livro.calcularPrecoFinal(15);

        ProdutoFisico produto = new ProdutoFisico();
        produto.setNome("Mouse");
        produto.setPreco(500);
        produto.calcularPrecoFinal(10);

        System.out.println("--------------------------");

        Servico servico = new Servico();
        servico.setDescricao("Trabalho para desenvolver uma Api Rest");
        servico.setPrecoHora(10);
        servico.calcularPrecoTotal(100);
        servico.aplicarDesconto(10);

        Produto produto1 = new Produto();
        produto1.setNome("Mouse");
        produto1.setPrecoUnitario(50);
        produto1.calcularPrecoTotal(10);
        produto1.aplicarDesconto(10);
    }
}
