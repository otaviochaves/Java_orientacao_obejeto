package exercicios.exercicios_heranca;

import exercicios.exercicios_heranca.animal.Cachorro;
import exercicios.exercicios_heranca.animal.Gato;
import exercicios.exercicios_heranca.carro.ModeloCarro;
import exercicios.exercicios_heranca.contaBancaria.ContaBancaria;
import exercicios.exercicios_heranca.contaBancaria.ContaCorrente;
import exercicios.exercicios_heranca.numerosPrimos.GeradorPrimo;
import exercicios.exercicios_heranca.numerosPrimos.NumerosPrimos;
import exercicios.exercicios_heranca.numerosPrimos.VerificadorPrimo;

public class Main {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibirInfo();

        System.out.println("-------------");


        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        System.out.println("-------------");

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        System.out.println("-------------");

        // Criando uma conta bancária com saldo inicial de 1000
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();

        // Realizando operações na conta corrente
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();

        System.out.println("-------------");

        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}
