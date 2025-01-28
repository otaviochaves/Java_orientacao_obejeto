package desafio_final;

import desafio_final.model.MinhasPreferidas;
import desafio_final.model.Musica;
import desafio_final.model.PodCast;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Forever");
        musica.setCantor("Kiss");

        for (int i = 0; i <100 ; i++) {
            musica.reproduzir();
        }
        for (int i = 0; i <100 ; i++) {
            musica.curtir();
        }

        PodCast podCast = new PodCast();

        podCast.setTitulo("Como aprender a programar");
        podCast.setDescricao("Taticas de como se tornar um mestre em programacao");
        podCast.setHost("Otavio Chaves");

        for (int i = 0; i < 100; i++) {
            podCast.reproduzir();
        }

        for (int i = 0; i < 100; i++) {
            podCast.curtir();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(podCast);
        minhasPreferidas.inclui(musica);
    }
}
