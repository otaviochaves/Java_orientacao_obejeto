package exercicios.exercicios_interface.tabuada_multiplicacao;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("Tabuada de multiplicação do " + numero + ":");
        for (int i = 0; i <= 10; i++){
            int resultado = i * numero;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
